package myException;

public class Test1 {
	public void m1(int a){
		
		System.out.println("hi");
	}
	public void  m1(Object o){
		
		System.out.println("Hi");
	}
	public static void main(String []args){
		Test1 t=new Test1();
		t.m1(0);
		t.m1(new Object());
		t.m1(null);
		Test1 t1=new Test3();
		t1.m1(0);
	}

}
class Test3 extends Test1{
	
	
	public void m1(int a){
		
		System.out.println("overriding concept");
	}
}
