package org.whrhs.dlamson.ocp.ex.post.q61;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {

	public static void filterData(ArrayList<Data> dataList, MyFilter mf) {
		Iterator<Data> i = dataList.iterator();
		while(i.hasNext()) {
			if(mf.test(i.next())) {
				i.remove();
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Data> al = new ArrayList<>();
		Data d = new Data(2);
		al.add(d);
		d = new Data(0);
		al.add(d);
		d = new Data(1);
		al.add(d);
		System.out.println("Before: " + al);
		filterData(al, new MyFilter());
		System.out.println("After: " + al);
	}
}
