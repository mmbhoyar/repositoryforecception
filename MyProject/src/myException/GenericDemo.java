package myException;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GenericDemo {

	public static <T extends List>void GenericMsethod(ArrayList<Object> names) {
//		Iterator it = names.iterator();
//		  
//	    while(it.hasNext()) {
//	     Object obj = (Object)it.next();
//	      System.out.println(obj);
//	    }
		
	}

	public static void GenericMethod(ArrayList<Object> names) {
		Iterator it = names.iterator();
		  
	    while(it.hasNext()) {
	     Object obj = (Object)it.next();
	      System.out.println(obj);
	    }
		
	}

}
