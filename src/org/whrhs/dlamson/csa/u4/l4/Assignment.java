package org.whrhs.dlamson.csa.u4.l4;

public class Assignment {

	private int pointsTotal;
	private int pointsEarned;
	private Student student;
	private String description;
	
	public Assignment(int pts, Student std, String desc) {
		pointsTotal = pts;
		pointsEarned = 0;
		student = std;
		description = desc;
	}
	
	public void setPointsEarned(int pts) {
		if(pts >= 0 && pts <= pointsTotal)
			pointsEarned = pts;
		else
			System.out.println(pts + " is invalid. Points Earned must be between 0 and " + pointsTotal + ".");
	}
	
	public String toString() {
		return student + ": " + pointsEarned + "/" + pointsTotal + " points";
	}
	
	public void mystery(int n, Student s) {
		System.out.println("\tINSIDE method call - BEFORE executing");
		System.out.println("\tn = " + n + ", s = " + s);
		n = 5;
		s.setName("Bubba");
		System.out.println("\tINSIDE method call - AFTER executing");
		System.out.println("\tn = " + n + ", s = " + s);
		
	}
	
	public static void main(String[] args) {
		Student jack = new Student("Jack", 123456);
		Assignment lab19 = new Assignment(10, jack, "LAB-019 Writing Instance Methods");
		int number = 13;
		
		System.out.println("BEFORE method call");
		System.out.println("number = " + number + ", jack = " + jack);
		
		System.out.println("\nRunning mystery method");
		lab19.mystery(number, jack);
		
		System.out.println("\nAFTER method call");
		System.out.println("number = " + number + ", jack = " + jack);
	}
}
