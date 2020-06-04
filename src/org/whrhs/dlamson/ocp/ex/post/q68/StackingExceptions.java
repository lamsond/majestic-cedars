package org.whrhs.dlamson.ocp.ex.post.q68;

public class StackingExceptions {

	public static void main(String[] args) {
		
		String[] names = {"Cora", "Monique", "Dan"};
		int n = 153;
		
		try {
			for(int i = 0; i < 10; i++) {
				if(names[i].length() <= 4) {
					n /= i;
					System.out.println(n);
				}
			}
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception e) {
			System.out.println("This exception must be last.");
		}
		finally {
			System.out.println("...buttily");
		}
	}
}
