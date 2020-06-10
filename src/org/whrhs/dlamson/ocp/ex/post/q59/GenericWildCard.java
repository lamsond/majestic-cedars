package org.whrhs.dlamson.ocp.ex.post.q59;

import java.util.List;
import java.util.ArrayList;

public class GenericWildCard {

	// shamrockShake() method can return a list of any subclass generic type of Number.
	public <T> List<? extends Number> shamrockShake(){
		ArrayList<Float> list = new ArrayList<>();
		list.add(3.14f);
		return list;
	}
}
