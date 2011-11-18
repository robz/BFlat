package a.b.c;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import a.b.c.GrammarTester.ProgramInfo;

public class BFlatGUI {
	static LogPane logPane;
	
	public static void makeGUI() {
		JFrame logFrame = new JFrame();
		logPane = new LogPane();
		logFrame.setContentPane(logPane);
		logFrame.setVisible(true);
		logFrame.setBounds(0, 0, 400, 400);
		logFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame frame = new JFrame();
		IDEPane pane = new IDEPane();
		frame.setContentPane(pane);
		frame.setVisible(true);
		frame.setBounds(400, 0, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void clearDebug() {
		logPane.logTx.setText("");
	}
	
	// channel = 0 means an error
	public static void debugPrint(int channel, String msg) {
		if (channel == 0)
			logPane.logTx.append("ERROR: "+msg+"\n");
		else 
			logPane.logTx.append("MSG: "+msg+"\n");
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
		JButton run;
		JTextArea[] tx;
		JLabel[] name;
		String[][] strs = new String[][]
		{
				{"Program","Stack","Symbol Table"},
				{"int x;\n" + 
				"int y;\n" + 
				"int z;\n" + 
				"boolean f;\n" + 
				"x = 5+4-3*2/1%6;\n" + 
				"y = x+4-x*2/1%x;\n" + 
				"z = x+y-x*y/y%x;\n" + 
				"f = (x>(y-1))==(z>y);","<stack>","<symbol table>"}
		};
		
		public IDEPane() {
			Border border = BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue);
			Font font1 = new Font("Courier New", Font.BOLD, 20),
				font2 = new Font("Courier New", Font.BOLD, 40);
			
			setLayout(new BorderLayout());
			
			JPanel center = new JPanel();
			center.setLayout(new GridLayout(1,3));
			add(center, BorderLayout.CENTER);
			
			tx = new JTextArea[3];
			name = new JLabel[3];
			for(int i = 0; i < 3; i++) {
				JPanel p = new JPanel();
				p.setLayout(new BorderLayout());
				name[i] = new JLabel(strs[0][i], JLabel.CENTER);
				p.add(name[i], BorderLayout.NORTH);
				tx[i] = new JTextArea(strs[1][i]);
				tx[i].setLineWrap(true);
				p.add(tx[i], BorderLayout.CENTER);
				center.add(p);
			}
			
			JLabel title = new JLabel("B-FLAT", JLabel.CENTER);
			add(title, BorderLayout.NORTH);
			
			run = new JButton("RUN");
			run.addActionListener(this);
			add(run, BorderLayout.SOUTH);
			
			for(JComponent jc:new JComponent[]{center, tx[0], tx[1], tx[2], 
					name[0], name[1], name[2]}) {
				jc.setBorder(border);
				jc.setFont(font1);
			}
			
			for(JComponent jc:new JComponent[]{run, title}) {
				jc.setBorder(border);
				jc.setFont(font2);
			}
		}
		// "x = 4; y = 2+3; 3 * (-x + y) * 4"
		public void actionPerformed(ActionEvent e) {
			clearDebug();
			
			String str = tx[0].getText();
			ProgramInfo info = new ProgramInfo(str);
			try { 
				GrammarTester.parseProgram(info);
				tx[1].setText(info.treeText);
				GrammarTester.runProgram(info); 
				tx[2].setText(""+info.result);
			} catch (Exception ex) {}
		}
	}
	
}
