package org.whrhs.dlamson.ocp.ex.post.q33;

public class Parent {

	public int magic() throws Exception{
		if(Math.random() < 0.5) {
			throw new Exception();
		}
		return 153;
	}
}
