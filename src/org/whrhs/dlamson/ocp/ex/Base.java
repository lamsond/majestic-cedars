package org.whrhs.dlamson.ocp.ex;

import java.util.*;

public class Base {

	public int h = 4;
	
	public int getH() {
		System.out.println("Base " + h);
		return h;
	}
	
	public <T> Collection<T> getCollection(T t, Integer n){
		return new ArrayList<T>();
	}
	
	public ArrayList<Number> transform(Set<Integer> list){
		return new ArrayList<Number>();
	}
	
	public List<Number> getList(){
		return new ArrayList<Number>();
	}
}
