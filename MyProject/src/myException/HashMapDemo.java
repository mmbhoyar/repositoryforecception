package myException;
import java.util.*;

	public class HashMapDemo {
	   public static void main(String args[]) {
	   // create hash map
	   HashMap newmap = new HashMap();
	      
	   // populate hash map
	   newmap.put(1, "tutorials");
	   newmap.put(2, "point");
	   newmap.put(3, "is best");
	      
	   // create set view for the map
	   //Set set=newmap.keySet();
	   Set set1=newmap.entrySet();
	      
	   // check set values
	   //System.out.println("Set values: " + set);
	   System.out.println("Set values: " + set1);
	   }    
	}

