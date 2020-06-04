package org.whrhs.dlamson.ocp.ex.post.q67;

import java.util.ArrayList;

public class DotOpPrecedence {

	public static void main(String[] args) {
		
		ArrayList<Object> objects = new ArrayList<>();
		
		objects.add("Happy");
		objects.add("Birthday");
		objects.add(39);
		
		for(Object object: objects) {
			if(object instanceof String) {
				// do this
				System.out.println(((String) object).substring(1, 3));
				// NOT this!
				// System.out.println((String) object.substring(1, 3));
				/* why? 
				 * because "dotting" has higher precedence than casting
				 * The (String) cast won't be applied until after the 
				 * substring is found, but substring is not a method
				 * of the Object class so casting must occur first.
				 */
			}
		}
	}
}
