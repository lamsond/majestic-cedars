package org.whrhs.dlamson.ocp.ex.post.q78;

public class PolyChild extends PolyParent{

	int x;
	
	public PolyChild() {
		this.x = 153;
	}
	
	@Override
	public void doStuff() {
		System.out.println("Poly Child!");
	}
	
	@Override
	public int getX() {
		return x;
	}
	
}
