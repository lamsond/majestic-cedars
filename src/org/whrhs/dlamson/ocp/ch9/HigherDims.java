package org.whrhs.dlamson.ocp.ch9;

public class HigherDims {
	
	public static void main(String[] args) {
		
		Object[][] iaa = {
				{"String is also an object"},
				{null},
				{new Object(), new Integer(10)}
		};
		
		for(int i = 0; i < iaa.length; i++) {
			System.out.println("Element[" + i +"] contains an array of length " + iaa[i].length);
			for(int j = 0; j < iaa[i].length; j++) {
				System.out.println("    Element[" + i + "][" + j + "] contatins " + iaa[i][j]);
			}
		}
		
	}
}
