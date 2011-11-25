package a.b.c;

import java.util.ArrayList;

public class ArrayStack<E> {
    private ArrayList<E> storage;
    StringBuilder dispInfo;

    public ArrayStack() {
          storage = new ArrayList<E>();
    }

    public void push(E value) {
          storage.add(value);
    }

    public E peek() {
          if (storage.size() == 0)
                return null;
          return storage.get(storage.size()-1);
    }

    public E pop() {
          if (storage.size() == 0)
              return null;
          return storage.remove(storage.size()-1);
    }

    public boolean isEmpty() {
          return storage.isEmpty();
    }
    
    public String getStackString(String ind) {
      String str = "";
      String temp = "";
      for(E elem: storage) {
        str += temp+ind+elem.toString().replaceAll("\n","\n"+ind);
        temp = "\n";
      }
      return str;
    }
}

