package org.whrhs.dlamson.ocp.ex.post.q33;

public class Child extends Parent{
	// method does not need to throw an exception because empty set is valid subset of Exception
	// it could throw any child of exception, such as NumberFormatException. But may not throw something 
	// higher up hierarchy such as `Throwable`
	@Override
	public int magic(){
		return -1;
	}
	
	public static void main(String[] args) {
		// if a method includes a `throws` clause, we must handle it. We can't just include a `finally` statement
		Parent par = new Parent();
		try {
			par.magic();
		}
		catch(NumberFormatException nex) {
			System.out.println(nex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Too bad");
		}
		
		// no try/catch required
		Child ch = new Child();
		ch.magic();
		
		// try catch required because compiler sees poly as a Parent
		// magic() method is bound at runtime.
		Parent poly = new Child();
		
		try {
			poly.magic();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("handled!");
		}
	}

}
