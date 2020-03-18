package org.whrhs.dlamson.csa.u9.l3.practice;

public class RobotTest {

	public static void main(String[] args) {
		
		Robot botA = new RogueRobot();
		RogueRobot botB = new RogueRobot();
		Robot botC = new Robot();
		//RogueRobot botD = new Robot();
		
		botA.sayHello();
		botA.move();
		//botA.move(50);
		//botA.destroy();
		
		botB.sayHello();
		botB.move();
		botB.move(50);
		botB.destroy();
		
		botC.sayHello();
		botC.move();
		//botC.move(50);
		//botC.destroy();
	
	}
}
