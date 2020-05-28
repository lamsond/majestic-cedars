package org.whrhs.dlamson.ocp.ex.post.q06;

public class CrashTiming {

	public static void main(String[] args) {
		
		int[] stuff = {1, 2, 3, 4, 5};
		int index = 4;
		
		// the post-fix++ doesn't occur since the crash happens first
		try {
			index = (stuff[++index])++;
		}
		catch(Exception ex) {
			System.out.println("You're out of bounds!");
		}
		// this runs regardless
		finally {
			System.out.println(index);
		}
	}
}
