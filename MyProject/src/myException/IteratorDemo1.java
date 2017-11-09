package myException;

import java.util.ArrayList;
import java.util.Iterator;
 
public class IteratorDemo1 {
 
  public static void main(String args[]){
	  ArrayList<Object> names = new ArrayList<Object>();
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");
    names.add(20);
   //names.add(new Integer(10));
   
    Iterator it = names.iterator();
  
    while(it.hasNext()) {
     Object obj = (Object)it.next();
      System.out.println(obj);
     
    }
  }
 
}