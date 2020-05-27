package org.whrhs.dlamson.ocp.ex;

import java.util.*;

public class Derrived extends Base{

	static int si = 10;
	
	public int h = 44;
	
	public int getH() {
		System.out.println("Derived " + h);
		return h;
	}
	public Derrived() {
		System.out.println(this);
	}
	@Override
	public <T> List<T> getCollection(T t, Integer n){
		System.out.println("running the T one");
		return new ArrayList<T>();
	}
	
	public <T> List<T> getCollection(String t, Integer n){
		System.out.println("running the String one");
		return new ArrayList<T>();
	}
	
	public ArrayList<Number> transform(Set<Integer> list){
		return new ArrayList<Number>(); 
	}
	
	byte getStatusCode(Object obj) {
		if(obj != null) {
			return 127;
		}
		return -1;
	}
	
	public Boolean tester() {
		return false;
	}
	
	public String toString() {
		return this.si + ""; 
	}
	
	@Override
	public ArrayList<Number> getList(){
		return new ArrayList<Number>();
	}
	
	public static void main(String[] args) {
		Base pizza = new Derrived();
		pizza.getH();
		System.out.println("Base(4) or Derived(44)?" + pizza.h);
		
	}
}
