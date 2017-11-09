package myException;

abstract public class MyAbstract {
	String Objectname;
	MyAbstract(String name){
		this.Objectname=name;
	}
	abstract public double area();
	public static void main(String[] args) {
	   MyAbstract m= new Circle(2,"circle");
	   System.out.println("Area of circle: " + m.area());
	   MyAbstract m1=new Rectangle(2,3,"rectangle");
	   System.out.println("Area of rectangle:"+m1.area());
	}
}
class Circle extends MyAbstract{
    int radius;
    double pi=3.14;
	Circle(int radius,String name) {
		super(name);
		this.radius=radius;
		//this.pi=pi;	
	}
	@Override
	public double area() {
		return (double)(pi*radius*radius)/2;	
	}
}
class Rectangle extends MyAbstract{
    int length,width;  
	Rectangle(int length,int width,String name) {
		super(name);
		this.width=width;
		this.length=length;
	}
	@Override
	public double area() {
	return(double)(width*length);		
	}
	
}