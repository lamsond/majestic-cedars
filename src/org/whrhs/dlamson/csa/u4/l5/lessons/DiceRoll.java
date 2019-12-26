package org.whrhs.dlamson.csa.u4.l5.lessons;

public class DiceRoll {

	private int roll1;
	private int roll2;
	private static int numRolls = 0;
	private static int sum = 0;
	
	/* Constructor randomly assigns a value between 1 and 6 to
	 * the roll1 and roll2 integers. The static value numRolls is
	 * incremented and the values of the rolls are added to the static
	 * value sum.
	 */
	public DiceRoll() {
		roll1 = (int) (6 * Math.random() + 1);
		roll2 = (int) (6 * Math.random() + 1);
		numRolls++;
		sum += (roll1 + roll2);
	}
	
	/* Add your methods here: */
	
	public static void main(String[] args) {
		
	}
}
