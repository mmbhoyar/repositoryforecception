package practice;

public class Demo {

	public static void main(String[] args) {
		try{
			int i = 10/0;
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		/*catch(ArithmeticException e){
			System.out.println(e);
		}
		*/
	}

}
