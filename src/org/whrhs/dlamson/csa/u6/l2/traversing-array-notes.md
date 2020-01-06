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

Can you find the error in the following code?

	!Java
	for(int i = names.length; i <= 0; i--){
		System.out.println(names[i]);
		
---
# Enhanced For Loops

Enahnced for loops were added in Java 7. They result in a more readable for loop that can be used with any Java *collection* such as *Array* and *ArrayList* objects.  

Our Scooby Doo example can now be rewritten as:  

	!Java
	for(String name: names){
		System.out.println(name);
	}

---
# For Each Loops cannot Mutate an Array.

Consider the following:  

---
# LAB-023

Write a class named Team