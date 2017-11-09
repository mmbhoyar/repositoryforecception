package myException;

import java.util.HashSet;

public class TestEmployee {
    protected TestEmployee(){
    	 
    	 
     }
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		Employee e1= new Employee(1,"mahesh");
		Employee e2= new Employee(1, "mahsssssh");
		
		@SuppressWarnings("rawtypes")
		HashSet hs= new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		
		System.out.println(hs.size());
	}
}
