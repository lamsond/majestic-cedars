package org.whrhs.dlamson.csa.u8.ex;

public class Snake {

	public static final int MAX_SEGMENTS = 100;
	public static final int RIGHT = 0;
	public static final int UP = 1;
	public static final int LEFT = 2;
	public static final int DOWN = 3;
	
	private int[][] segments;
	private int numSegments;
	private int direction;
	
	/* initializes the segments, numSegments, and direction */
	public Snake() {
		// implementation not shown
	}
	
	/* returns whether or not the head of the snake has the same coordinates
	 * as another segment of the snake, indicating a self-collision. 
	 */
	public boolean collidedWithSelf() {
		// implementation not shown
		return true;
	}
	
}
