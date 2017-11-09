package myException;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyTest1 {
	public void m1() {

		ArrayList<Object> names = new ArrayList<Object>();
		names.add("mahesh");
		names.add("akshay");
		names.add("prashant");
		GenericDemo.GenericMethod(names);;
		LinkedList<Object> names1 = new LinkedList<Object>();
		names.add("guru");
		names.add("nitin");
		names.add("rohit");

	}
}
