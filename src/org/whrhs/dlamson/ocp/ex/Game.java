package org.whrhs.dlamson.ocp.ex;

public class Game {

	public void play() throws Exception{
		System.out.println("playing");
	}
}

class Soccer extends Game{
	
	@Override
	public void play() {
		System.out.println("playing soccer");
	}
	
	public static void main(String[] args) {
		Game g = new Soccer();
		try {
			g.play();
		}
		catch(Exception e){
			
		}
	}
	
}