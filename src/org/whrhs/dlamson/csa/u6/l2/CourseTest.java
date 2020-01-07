package org.whrhs.dlamson.csa.u6.l2;

public class CourseTest {

	public static void main(String[] pizza) {
		
		Student sb = new Student("Spongebob");
		Student pat = new Student("Patrick");
		Student sq = new Student("Squidward");
		Student gar  = new Student("Gary");
		
		sb.setGrades(new int[]{100, 50, 40, 50, 60});
		pat.setGrades(new int[]{48, 52, 67, 22, 23});
		sq.setGrades(new int[]{98, 95, 94, 97, 99});
		gar.setGrades(new int[]{70, 77, 80, 82, 78});
		
		Course csa = new Course("AP Computer Science A");
		csa.addStudent(sb);
		csa.addStudent(pat);
		csa.addStudent(sq);
		csa.addStudent(gar);
		
		csa.printRoster();
	}
}