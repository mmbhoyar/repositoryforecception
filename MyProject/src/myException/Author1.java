package myException;
import java.util.*;
import java.util.ArrayList;  
import java.util.Collections;

	public class Author1 implements Comparable<Author1> {
		  String firstName; 
		  String bookName; 
		  int auAge; 
		  Author1(String first, String book, int age){ 
		    this.firstName = first; 
		    this.bookName = book; 
		    this.auAge = age; 
		  } 
		  public String getFirstName() { 
		    return firstName; 
		  }
		  public void setFirstName(String firstName) { 
		    this.firstName = firstName; 
		  }
		  public String getBookName() { 
		    return bookName; 
		  }
		  public void setBookName(String bookName) { 
		    this.bookName = bookName; 
		  }
		  public int getAuAge() { 
		    return auAge; 
		  }
		  public void setAuAge(int auAge) { 
		    this.auAge = auAge; 
		  } 
		  @Override 
		  /* 
		   * When we only use Comparable, this is where we write sorting
		   * logic. This method is called when we implement the Comparable
		   * interface in our class and call Collections.sort()
		   */ 
		  public int compareTo(Author1 au){         
		    return this.firstName.compareTo(au.firstName);   
		  }
		   public static void main(String args[]){    
			     // List of objects of Author class      
			     ArrayList<Author1> al=new ArrayList<Author1>();        
			     al.add(new Author1("Mahesh", "aaa",  45));
			     al.add(new Author1("Nana", "bbb", 56));
			     al.add(new Author1("Prashant", "ccc", 65));
			     al.add(new Author1("Debu", "ddd", 51));
			     al.add(new Author1("Chivda", "fff", 62));
			     /*       
			      * Sorting the list using Collections.sort() method, we       
			      * can use this method because we have implemented the        
			      * Comparable interface in our user defined class Author       
			      */      
			     System.out.println("Sorting by Author First Name:");      
			     Collections.sort(al);        
			     for(Author1 au: al){       
			       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
			           au.getAuAge());        
			     } 
			     /*Sorting using AuthorAgeComparator*/      
			     System.out.println("Sorting by Author Age:");
			     Collections.sort(al, new AuthorAgeComparator());
			     for(Author1 au: al){       
			       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
			          au.getAuAge());        
			     }             
			     /*Sorting using BookNameComparator*/      
			     System.out.println("Sorting by Book Name:");      
			     Collections.sort(al, new BookNameComparator());      
			     for(Author1 au: al){       
			        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
			           au.getAuAge());       
			     }    
			  }
		
	}

		class AuthorAgeComparator implements Comparator<Author1>{
		   public int compare(Author1 a1,Author1 a2){
		     if(a1.auAge==a2.auAge)
		       return 0;
		   else if(a1.auAge>a2.auAge)
		       return 1;
		   else
		       return -1;
		  }
		}
		
		 class BookNameComparator implements Comparator<Author1>{ 
		  public int compare(Author1 a1,Author1 a2){   
		     return a1.bookName.compareTo(a2.bookName); 
		  }  
			 
	  
		}  

