package myException;

import java.util.*;

class InvalidAgeException extends Exception {
	String message;
	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}

}

public class Myclass {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws InvalidAgeException {
		if (age < 18)

			throw new InvalidAgeException("invalid input");

		/*
		 * catch(InvalidAgeException e) { e.printStackTrace(); } this.age=age;
		 */
	}

	public static void main(String[] args) {

		Myclass m = new Myclass();
		m.getName();
		m.setName("mahesh");
		m.getAge();
		try {
			m.setAge(16);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}

}
