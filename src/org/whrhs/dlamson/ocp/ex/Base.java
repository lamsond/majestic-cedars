package org.whrhs.dlamson.ocp.ex;

import java.util.Collection;
import java.util.ArrayList;

public class Base {

	public <T> Collection<T> getCollection(T t, Integer n){
		return new ArrayList<T>();
	}
}
