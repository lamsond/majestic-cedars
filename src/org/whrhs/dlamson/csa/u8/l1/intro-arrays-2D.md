# intro to 2D arrays

## A *2D Array* is an *Array of Arrays*

Suppose we organized our class into String arrays, by the rows where we sit:  

	!Java
	String[] row1 = {"Saad", "Daniel"};
	String[] row2 = {"Ariha", "Bill", "Anthony R.", "Adam", "Justine", "Abby"};
	String[] row3 = {"Inica", "Adithi", "Tony", "Charlotte", "Leo", "Anthony Y."};
	String[] row4 = {"Shane", "Spencer", "Cullen", "Toby"};
	String[] row5 = {"Rishab", "Christian", "Zach"};

If we wanted to group of these *rows* into a single array, we can do the following:  

	!Java
	String[][] csaPeriod7 = {row1, row2, row3, row4, row5};

**NOTE: **The data-type of this array is `String[][]`. This is because `csaPeriod7` is an array of `String[]` objects.  

	!Java
	System.out.println(csaPeriod7); // prints a reference
	System.out.println(Arrays.toString(csaPeriod7)); // prints an array of references
	System.out.println(Arrays.deepToString(csaPeriod7)); // prints array of array of strings


	
