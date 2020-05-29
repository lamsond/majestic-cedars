package org.whrhs.dlamson.ocp.ex.post.q18;

import java.util.List;
import java.util.ArrayList;

public class GenericStuff {

	public static <T> List<T> doStuff(T t) {
		System.out.println("The T one is running");
		ArrayList<T> result = new ArrayList<>();
		result.add(t);
		return result;
	}
	
	public static <T> List<String> doStuff(String s){
		System.out.println("The String one is running");
		ArrayList<String> result = new ArrayList<>();
		result.add(s + s);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(doStuff(153));
		System.out.println(doStuff("snot boogie"));
	}
}
