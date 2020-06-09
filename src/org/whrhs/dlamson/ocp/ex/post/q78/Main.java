package org.whrhs.dlamson.ocp.ex.post.q78;

public class Main {

	public static void main(String[] args) {
		
		PolyParent mom = new PolyParent();
		PolyChild cora = new PolyChild();
		PolyParent poly = new PolyChild();
		
		System.out.println("Predicted Output (Mom): ");
		System.out.println("Poly Parent!");
		System.out.println("mom x: 13");
		System.out.println("mom getX: 13");
		
		System.out.print("mom doStuff: ");
		mom.doStuff();
		System.out.println("mom x: " + mom.x);
		System.out.println("mom getX: " + mom.getX());

		System.out.println("Predicted Output (Cora): ");
		System.out.println("Poly Child!");
		System.out.println("cora x: 153");
		System.out.println("cora getX: 153");
		
		System.out.print("cora doStuff: ");
		cora.doStuff();
		System.out.println("cora x: " + cora.x);
		System.out.println("cora getX: " + cora.getX());
		
		System.out.println("Predicted Output (Poly): ");
		System.out.println("Poly Child!");
		System.out.println("poly x: 13");
		System.out.println("poly getX: 153");
		
		System.out.print("poly doStuff: ");
		poly.doStuff();
		System.out.println("poly x: " + poly.x);
		System.out.println("poly getX: " + poly.getX());
		
		PolyChild casty = (PolyChild) poly;
		System.out.println("Castify!");
		System.out.print("casty doStuff: ");
		casty.doStuff();
		System.out.println("casty x: " + casty.x);
		System.out.println("casty getX: " + casty.getX());
	}
}
