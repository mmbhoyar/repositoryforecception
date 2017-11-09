package myException;
import java.util.*;
  
	class MyOwnException extends Exception {
		   public MyOwnException(String msg){
		      super(msg);
		   }
		}

	 public class MyEmployee{
		   static void  employeeAge(int age) throws MyOwnException{
		      if(age < 19)
		         throw new MyOwnException("Age can't be less than 19");
		      else
		         System.out.println("Input is valid!!");
		   }
		   public static void main(String[] args) {
		       try {
		            employeeAge(18);
		       }
		       catch (MyOwnException e) {
		            e.printStackTrace();
		       }
		   }
		}

