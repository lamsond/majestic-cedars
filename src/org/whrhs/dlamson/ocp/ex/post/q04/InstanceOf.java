package org.whrhs.dlamson.ocp.ex.post.q04;

public class InstanceOf {

	public static void main(String[] args) {
		
		Byte bObj = 1;
		byte b = 2;
		Short sObj = 3;
		short s = 4;
		Integer iObj = 5;
		int i = 6;
		
		Long lObj = 7L;
		long l = 8;
		
		Number n = bObj;
		
		//boolean bool1 = b instanceof Byte; //can't have primitive on left of instanceof
		
		boolean bool2 = n instanceof Double; /* This is okay because a reference of type Number could be
		an object of type Double, in this case it is not so will return false */
		
		/*boolean bool3 = bObj instanceOf Double;  This will not compile because the compiler knows a Byte can't be 
		a double, so there is no reason we should be checking for that */
		
		/* In general `a instanceOf B` will compile only if declared type of a is a superclass of B */
		
		/* == is similar, it can only be used if there is an is-a relationship between the two declared types */
		
		System.out.println(bool2);
	}
}
