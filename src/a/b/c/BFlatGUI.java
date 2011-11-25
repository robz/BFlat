package a.b.c;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.text.Document;

import a.b.c.GrammarTester.ProgramInfo;

public class BFlatGUI {
	static IDEPane pane;
	
	public static void makeGUI() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		JFrame frame = new JFrame();
		pane = new IDEPane();
		frame.setContentPane(pane);
		frame.setVisible(true);
		frame.setBounds(0, 0, dim.width, dim.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void setSymbolTable(String str) {
		System.out.println(str);
		pane.tx[2].setText(str);
	}

	public static void setStack(String str) {
		pane.tx[1].setText(str);
	}
	
	public static void setProgTree(String str) {
		pane.tx[3].setText(str);
		Document d = pane.tx[3].getDocument();
		pane.tx[3].select(d.getLength(), d.getLength());
	}
	
	public static void clearDebug() {
		pane.tx[4].setText("");
	}
	
	// channel = 0 means an error
	// channel = 1 is coming from localscope (symbol table assignments)
	// channel = 3 means function/stack stuff
	// channel = 5 means exit/entering scope messages
	// channel = 6 pausing messages
	public static void debugPrint(int channel, String msg) {
		String debugMsg = "";
		if (channel == 0)
			debugMsg = "ERROR: "+msg+"\n";
		else if (channel == 1)
			;//debugMsg = "ASGMT: "+msg+"\n";
		else if (channel == 3) 
			debugMsg = msg+"\n";
		else if (channel == 5)
			;//debugMsg = "SCOPE: "+msg+"\n";
		else if (channel == 6)
			;//debugMsg = "STEP: "+msg+"\n";
		else
			debugMsg = "MSG: "+msg+"\n";
		pane.tx[4].append(debugMsg);
		Document d = pane.tx[4].getDocument();
		pane.tx[4].select(d.getLength(), d.getLength());
		RunLogger.record(msg);
	}
	
	@SuppressWarnings("serial")
	static public class LogPane extends JPanel
	{
		JTextArea logTx;
		
		public LogPane() {
			logTx = new JTextArea();
			logTx.setEditable(false);
			JScrollPane scrollPane = new JScrollPane(logTx);
			setLayout(new BorderLayout()); 
			add(scrollPane, BorderLayout.CENTER);
		}
	}

	@SuppressWarnings("serial")
	static public class IDEPane extends JPanel implements ActionListener
	{
		JButton runBtn, stepBtn;
		JTextArea[] tx;
		JLabel[] name;
		String[][] strs = new String[][]
		{
				{"Program","Stack","Symbol Table","AST","Debug"},
				{"function main() \n" + 
						"{\n" + 
						"\tint x;\n" + 
						"\tx = fact(4);\n" + 
						"}\n" +
						"\n" + 
						"function fact(int n){\n" + 
						"\tint retVal;\n" + 
						"\tif(n < 2){\n" + 
						"\t\tretVal = 1;\n" + 
						"\t}\n" + 
						"\telse{\n" + 
						"\t\tretVal = n * fact(n - 1);\n" + 
						"\t}\n" + 
						"}\n",
				"<stack>","<symbol table>","<ast>","<debug>"}
		};
		
		public IDEPane() {
			Border border = BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue);
			Font font1 = new Font("Courier New", Font.PLAIN, 15),
				font2 = new Font("Courier New", Font.BOLD, 20),
				font3 = new Font("Courier New", Font.BOLD, 40);
			
			setLayout(new BorderLayout());
			
			JPanel center = new JPanel();
			center.setLayout(new GridLayout(1,4));
			add(center, BorderLayout.CENTER);
			
			tx = new JTextArea[5];
			name = new JLabel[3];
			for(int i = 0; i < 3; i++) {
				JPanel p = new JPanel();
				p.setLayout(new BorderLayout());
				name[i] = new JLabel(strs[0][i], JLabel.CENTER);
				p.add(name[i], BorderLayout.NORTH);
				tx[i] = new JTextArea(strs[1][i]);
				tx[i].setLineWrap(true);
				tx[i].setTabSize(3);

				JScrollPane scrollPane = new JScrollPane(tx[i]);
				p.add(scrollPane, BorderLayout.CENTER);
				center.add(p);
			}
			
			JTabbedPane tabs = new JTabbedPane();
			for(int i = 4; i >= 3; i--) {
				tx[i] = new JTextArea(strs[1][i]);
				tx[i].setLineWrap(true);
				tx[i].setTabSize(2);
				JScrollPane scrollPane = new JScrollPane(tx[i]);
				tabs.add(strs[0][i], scrollPane);
			}
			center.add(tabs);
			
			JLabel title = new JLabel("B-FLAT", JLabel.CENTER);
			add(title, BorderLayout.NORTH);
			
			JPanel bottomPane = new JPanel();
			bottomPane.setLayout(new GridLayout(2,1));
			
			runBtn = new JButton("run");
			runBtn.addActionListener(this);
			bottomPane.add(runBtn);
			
			stepBtn = new JButton("step to next function call or return");
			stepBtn.addActionListener(this);
			bottomPane.add(stepBtn);
			
			add(bottomPane, BorderLayout.SOUTH);
			
			for(JComponent jc:new JComponent[]{center, tx[0], tx[1], tx[2], tx[3], tx[4]}) {
				jc.setBorder(border);
				jc.setFont(font1);
			}
			
			for(JComponent jc:new JComponent[]{name[0], name[1], name[2], tabs}) {
				jc.setBorder(border);
				jc.setFont(font2);
			}
			
			for(JComponent jc:new JComponent[]{runBtn, stepBtn, title}) {
				jc.setBorder(border);
				jc.setFont(font3);
			}
		}
		
		int state = 0;
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(stepBtn)) {
				if (state == 0) {
					clearDebug();
					setStack("");
					setProgTree("");
					setSymbolTable("");
					
					String str = tx[0].getText();
					new ProgramRunnerThread(str).start();
					state = 1;
					runBtn.setEnabled(false);
				} else if (state == 1) {
					if (Pauser.isWaiting())
						Pauser.go(); 
					else {
						state = 0;
						runBtn.setEnabled(true);
					}
				}
			} else if (e.getSource().equals(runBtn)) {
				clearDebug();
				setStack("");
				setProgTree("");
				
				String str = tx[0].getText();
				executeProgram(str);
			}
		}
		
		public static void executeProgram(String programText) {
			try{
				ProgramInfo info = new ProgramInfo(programText);
				GrammarTester.parseProgram(info);
				
				if (!info.parseError) {
					//System.out.println(info.treeText);
					BFlatGUI.setProgTree(TreePrinter.treePrint(info.treeText));
					GrammarTester.runProgram(info, false); 
					if (info.result != null)
						BFlatGUI.debugPrint(4, "Program result: "+info.result.toString());
					else 
						BFlatGUI.debugPrint(4, "Program result: null");
				} else {
					String[] s = info.parseErrorMsg.split("\n");
					for(String msg:s)
						BFlatGUI.debugPrint(0, msg);
				}
			} catch(Exception ex) {
				BFlatGUI.debugPrint(0, "failed during execution:"+ex.getMessage());
				ex.printStackTrace();
				System.out.println("stack empty?" +EvaluatorWalker.scopeStack.isEmpty());
			}
		}
	}
	
}
