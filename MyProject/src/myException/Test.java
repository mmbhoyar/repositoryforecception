package myException;
//import java.util.ArrayList;
//import java.util.*;
import java.util.Date;
import java.util.HashSet;
import java.sql.*;
 class Test {

	 public static void main(String[] args){
		 String s1=new String ("sangli");
		 String s2="sangli";
		 String s3=new String ("sangljjji");
		 String s5=s1;
		  String s4="sangli";
		 System.out.println(s2==s4);
		 
	     System.out.println(s1==s2);
	     System.out.println(s1.equals(s3));
	     System.out.println(s1==s3);
	   
	     
	     System.out.println(s5==s1);
	     System.out.println(s5==s2);
	     String s6=new String("SANGLI");
	     System.out.println(s1.equals(s6));
	     System.out.println(s1.equalsIgnoreCase(s6));
	     String s7="SANGLI";
	     System.out.println(s2==s7);
	     String s8=s1.intern();
	     System.out.println(s8==s1);
	     System.out.println(s8==s2);
		 
		 HashSet hs= new HashSet();
		 hs.add(s1);
		 hs.add(s3);
		System.out.println( hs.size());
		 
		}
 
 }
 
