package org.whrhs.dlamson.ocp.ex.post.q61;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import java.io.IOException;

public class TestClassImproved {
	
	
	public static void filterData(ArrayList<Data> dataList, Predicate<Data> mf) {
		Iterator<Data> i = dataList.iterator();
		while(i.hasNext()) {
			if(mf.test(i.next())) {
				i.remove();
			}
		}
		
	}
	
	public static void main(String[] args) {
		short s = 10;
		char c = (char) s;
		s = (short) c;
		
		ArrayList<Data> al = new ArrayList<>();
		Data d = new Data(2);
		al.add(d);
		d = new Data(0);
		al.add(d);
		d = new Data(1);
		al.add(d);
		System.out.println("Before: " + al);
		// the lambda expression instantiates a class similar to MyFilter
		// the Predicate interfaces `test()` method is implemented using the lambda statement.
		filterData(al, item -> item.value == 0);
		System.out.println("After: " + al);
		try {
			System.out.println("rogue master");
		}
		catch(Exception e) {
			
		}
	}

}
