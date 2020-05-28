package org.whrhs.dlamson.ocp.ex.post.q07;

import java.util.ArrayList;

public class VarWithList {

	public static void main(String[] args) {
		
		// the var is allowed - will make a list of type <Object>
		var telecaster = new ArrayList<>();
		
		telecaster.add("Twang");
		telecaster.add(2);
		telecaster.add(new StringBuilder());
		System.out.println(telecaster.getClass());
	}
}
