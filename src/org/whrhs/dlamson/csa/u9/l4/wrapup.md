# U9L4: The `Object` class
## Everyone's favorite SUPERCLASS :)

---
# the `Object` class

In Java, every class that doesn't explicitly extend another class, implicitly extends the `Object`.  
The `Object` class includes several inherited methods that we will look at closer in this lesson.  

![object class UML](objectClassUML.png) 

---
# Three Methods to look at today

---
# toString() method

Returns a String representation of an object.  
Defaults to printing the reference value.  
Benefits of using @Override

	!Java
	public String toString(){
		return rank + suit;
	}

---
# .equals() method: identity vs. equality

---
# .equals() simplified overload

---
# .equals() proper override

link to javadoc

---
# casting primitives (review)


---
# casting objects (new)

---
# ClassCastException

---
# Why doesn't the compiler catch this?

---
# instanceof operator

---
# .equals() method complete

---
# HashMaps introduced

---
# HashMap name example 

---
# HashMap card not working

---
# Why .hashCode() matters

---
# simple .hashCode override

---
# LAB-032 

---
# BlackJackHand Class

---
# DealerCount Class

 
# Why we can't put primitives in and ArrayList

**polymorphism** refers to the ability of an object to exhibit behaviors associated with different types.  
Java makes polymorphism possible through inheritance and overriding methods.

For example, all of the different types of "fruit" below were extended from a common `Fruit` class. They each have a `render()` method, 
with completely different instructions on how they should be drawn. 

![fruits](fruit.png) 

---
# UML diagram for PacMan example

![pacman uml](PolyManSm.png)

---
# using polymorphism

Typically when instantiating an object, the reference type will match the type of object being constructed. For example:  

	!Java
	Orange f = new Orange(100, 250);
	
However, some interesting things happen when we allow the reference type to be a superclass of the object we are constructing.  

	!Java
	Fruit f = new Orange(100, 250);  

> If S is a subclass of T, then assigning an object of type S to a reference of type T facilitates polymorphism.

We are allowed to do this because an Orange object *is a* fruit. This allows us the flexibility to assign the same reference f to a completely
different type of fruit without breaking the program.  

	!Java
	Fruit f = new Orange(100. 250);
	f.render();
	f = new Banana(200, 250);
	f.render();
	
---
# Usage 1 - Method Return Types

## Random Fruit Demo

	!Java
	public Fruit getRandomFruit(){
		// will randomly return a new Banana, Orange, or Cherry object
	}

---
# Usage 2 - Arrays

## Arrays with mixed fruit types

	!Java
	Fruit[] fruit = new Fruit[8];
	for(int i = 0; i < fruit.length(); i++){
		fruit[i] = getRandomFruit();
	}

---
# Usage 3 - Formal Parameters

## PolyMan Demo

	!Java
	public void eat(Fruit f){
		// determine if PolyMan is over the fruit,
		// update points and make fruit disappear.
	}

---
# How this works

## Compile Time vs. Runtime

**Complier**: Only checks to see if the method called on a reference has been provided by the reference type class
or a superclass. For example, when we declare `Fruit f = new Orange();` and call `f.render()` it only looks to see if `render()` is defined in the `Fruit` class (it is not) and then checks *up* the hierarchy in the `Sprite` class (it is). The complier doesn't bind the actual overridden method details from the `Orange` class to the object.  

**JVM**: The JVM executes the overridden method at runtime. This is called *dynamic binding* and it is essential to 
making polymorphism work in Java.


---
# lab 031

![pacman uml](PolyManXSm.png)

* Design your own subclass of `Fruit` to work with this program.
	* Give it a point value
	* Design a `render()` method for your fruit.
* Modify the `getRandomFruit()` method so it can return your fruit as well as the other 4.
* Only submit the following two things
	1. Your `subclass` code
	2. A screenshot of what your fruit on the game panel.

---
# UML diagram for PacMan example

![pacman uml](PolyManSm.png)
