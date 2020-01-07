# U6L2: Traversing Arrays
---
# Looping through an array

It is often useful to loop through all the elements of an array one at time.
For example, if we were given the following array of Scooby Doo characters  
### names
  

0        | 1        | 2       | 3        | 4
-------- | -------- | ------- | -------- | -------- 
"Shaggy" | "Scooby" | "Velma" | "Daphne" | "Fred"

We could write a for loop that iterates from `0` to `4` to print each out on a separate line.

	!Java
	for(int i = 0; i < 5; i++){
		System.out.println(names[i]);
	} 

A better way to write this would be to use `names.length` instead of the *magic number* `5`

	!Java
	for(int i = 0; i < names.length; i++){
		System.out.println(names[i]);
	} 

---
# Off By One Errors

The most common errors when traversing arrays are "off by one" types. The following loop is supposed to print all names in reverse order. Can you find the error in the following code?

	!Java
	for(int i = names.length; i >= 0; i--){
		System.out.println(names[i]);
	}
		
---
# For Each Loops

Also called *enhanced for loops* were added to Java in version 5. They result in a more readable for loop that can be used with any Java *collection* such as *Array* and *ArrayList* objects.  

To use a for each loop, we must use the following header syntax:

`for(arrayType varName: arrayName)`  

**arrayType** is the data type held in the array.  
**varName** is the name of a temporary variable that will hold the current element of an array.  
**arrayName** is the variable name of the array.  
 
Our Scooby Doo example can now be rewritten as:  

	!Java
	for(String name: names){
		System.out.println(name);
	}


**Advantages** of the *for each* loop  
readability  
eliminates the chance of *off by one* errors  
programmer does not need to be concerned with *indexing*.  
 
---
# For each loops can't modify an array.

Suppose I have a `grades` array that has been populated as shown below

	!Java
	int[] grades = {77, 92, 88, 95, 100};

I want to design a method that takes an integer array such as `grades` and resets all the values to zero. The following method would do this:

	!Java
	public static void resetGrades(int[] grades){
		for(int i = 0; i < grades.length; i++){
			grades[i] = 0;
		}
	}

However, the for-each version would not. This is because `grade` is a local copy of the primitive value `grades[i]`. We must use a traditional for loop if we want to modify the array.

	!Java
	public static void resetGrades(int[] grades){
		for(int grade: grades){
			grade = 0;
		}
	}
 
---
# LAB 023 Starter Code

	!Java
	// write this in the same project as Student.java from LAB-022
	import java.util.Arrays;
	
	public class Course{
	
	    public static final int MAX_STUDENTS = 30;
	    private String name;
	    private numStudents;
	    private Student[] students;
	    
	    // constructor
	    
		// methods
		
	}

---
#LAB-023 TODO: Student Class
Create the following constructor and instance methods
###Constructor
**Course(String name):** takes a string used to set the `name` attribute. Initialize the `students` array here. Use `MAX_STUDENTS` to set the size. Set `numStudents` to zero.

###Instance Methods
**addStudent():** Takes a Student object and adds the student to `students` array **only if** there is room for the student in the class. Increment the `numStudents` variable.  
**getNumImproved():** Traverses the `students` array and returns the number of students in the course that have improved.  
**getMaxAverage():** Traverses the array of Students and returns the maximum average grade in the course.  
**getMinAverage():** Traverses the array of Students and returns the minimum average grade in the course.  
**printRoster():** Prints the roster of a course as shown on the next slide. Include numbers, names, and averages. Use the `for-each` type for this. (You will need to add a `getName()` method to Student class if you haven't already.)  
**NOTE: ** If your array is not full, you will get an error when trying to print a `null` student. To prevent this, add the conditional `if(student != null)` before printing.

---
# Output of printRoster() method
Roster for AP Computer Science A  
1. Shaggy 71.0  
2. Scooby 100.0  
3. Velma 99.8  
4. Daphne 92.4  
5. Fred 81.5  

* make your own test code, but you don't need to submit it.