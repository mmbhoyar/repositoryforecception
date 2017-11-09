package myException;
import java.util.ArrayList;   
import java.util.Collections;
public class Author implements Comparable<Author> {

		       String firstName;
		       String lastName;
		       String bookName;
		       Author(String first, String last, String book){
			   this.firstName = first;
			   this.lastName = last;
			   this.bookName = book;
		  }
			
		  @Override
		  /*
		   * This is where we write the logic to sort. This method sort 
		   * automatically by the first name in case that the last name is 
		   * the same.
		   */
		  public int compareTo(Author aa){
		     /* 
		      * Sorting by last name. compareTo should return < 0 if this(keyword) 
		      * is supposed to be less than au, > 0 if this is supposed to be 
		      * greater than object au and 0 if they are supposed to be equal.
		      */
		     int last = this.bookName.compareTo(aa.bookName);
		     //Sorting by first name if last name is same d
		     return last == 0 ? this.firstName.compareTo(aa.firstName) :last;
		  }
		 
		 
		   @Override
		public String toString() {
			return "Author [firstName=" + firstName + ", lastName=" + lastName + ", bookName=" + bookName + "]";
		}

		public static void main(String args[]){  
		      // List of objects of Author class
		      ArrayList<Author> al=new ArrayList<Author>(); 
		      al.add(new Author("Amahesh","Abhoyar", "abc"));  
		      al.add(new Author("Bakshay","Bbagade", "efg"));
		      al.add(new Author("Cprashant","Cbagade", "300"));
		      al.add(new Author("Dpramod","Dkale", "Sky Boys"));
		      al.add(new Author("Enama","Efarande", "Song of Ice"));
		      
		      /*
		       * Sorting the list using Collections.sort() method, we
		       * can use this method because we have implemented the 
		       * Comparable interface in our user defined class Author
		       */
		      Collections.sort(al);  
		      //System.out.println(al.toString());
		      for(Author str:al){  
		    	  System.out.println(str.firstName+" "+
		          str.lastName+" "+"Book: "+str.bookName);  
		      } 
		   }  
		}  


