package myException;

public class TestConstruct {
     String name;
     int rollno;
	 TestConstruct(String name,int rollno){
		 this.name=name;
		 this.rollno=rollno;
		 System.out.println(this.name);
		 System.out.println(this.rollno);
	 }
	public static void main(String[] args) {
		TestConstruct t=new TestConstruct("mahesh",123);

	}

}
