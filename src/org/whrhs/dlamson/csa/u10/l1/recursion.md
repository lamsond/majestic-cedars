# Unit 10: Recursion Crash Course
---
# This Week

* Watch this video
* Experiment with recursive methods on your own
* Answer Exit Ticket Questions (will post Tuesday)

---
# Review the call stack

The *stack* is a memory structure where the methods we call are executed. Think of it like a **to do** list. The first item added to every JVM stack is the `main` method.

**call stack**  
1. main()

![stack](stizack.jpg)

---
# Stack tracing

Whenever a method is called within another method, the new method is added to the top of the stack.  

	!Java
	public static void main(String[] args){
	    int x = 5;
	    methodA();
	}
	 
**call stack**  
1. methodA()
2. main()

---
# Stack tracing

Suppose methodA includes a call to `System.out.println()`, Then `println()` will be moved to the top of the stack.

	!Java
	public boolean void methodA(){
	    int y = 13;
	    System.out.println("this used to be a ghost town, now even the ghosts have died out");
	    return y % 2 == 0;
	}
	
**call stack**  
1. println()
2. methodA();
3. main();

---
# LIFO Structure

The items most recently added to the stack are executed first. **L**ast **I**n **F**irst **O**ut.  

**call stack**  
1. println()
2. methodA();
3. main();

![stack](stizack.jpg)

---
# Recursion defined

A **recursive method** is a method that calls itself. For example

	!Java
	public static void lasagna() {
		System.out.println("lasagna");
		lasagna();
		System.out.println("pizza");
	}

![lasagna](lasagna.jpg)

Let's explore what happens when we call this method.

---
# Stack tracing lasagna()

	!Java
	public static void main(String[] args){
		lasagna();
	}

**stack**  
1. lasagna()
2. main();

---
# Stack tracing lasagna()

	!Java
	public static void lasagna() {
		System.out.println("lasagna");
		...
		...
	}

**stack**  
1. println()
2. lasagna()
3. main()

---
# Stack tracing lasagna()
 
	!Java
	public static void lasagna() {
		...
		lasagna();
		...
	}

**stack**  
1. lasagna()
2. lasagna()
3. main()

---
# Stack tracing lasagna()
 
	!Java
	public static void lasagna() {
		System.out.println("lasagna");
		...
		...
	}

**stack**  
1. println()
2. lasagna()
3. lasagna()
4. main()

---
# Stack tracing lasagna()
 
	!Java
	public static void lasagna() {
		...
		lasagna()
		...
	}

**stack**  
1. lasagna()
2. lasagna()
3. lasagna()
4. main()

---
# a few microseconds later...
 
	!Java
	public static void lasagna() {
		System.out.println("lasagna");
		lasagna()
		System.out.println("pizza");
	}

**stack**  
1. lasagna()
2. lasagna()
3. lasagna()
4. lasagna()
5. lasagna()
6. lasagna()
7. lasagna()
8. lasagna()
9. lasagna()
10. main()

---
# Ruh-Roh Overflow!

![scoob](scoob.jpg)

---
# Stack Overflow vs. Infinite Loop

an infinite uses up **CPU** resources

	!Java
	public static void infinteLoop(){
	    int count = 1;
	    while(1 + 1 == 2){
	        count++;
	    }
	}

a stack overflow uses up **memory**

	!Java
	public static void stackOverflow(){
	    stackOverflow();
	}

---
# An example that actually works

**stack**  
1. main() (calls `System.out.println(pizza(3));`)

	!Java
	/* precondition: n is a positive integer */
	public static int pizza(int n){
	    if(n == 1){
	        return 1;
	    }
	    return 2*n + pizza(n-1) - 1;
	}
	public static void main(String[] args){
	    System.out.println(pizza(3));
	}

  
---
# Tracing pizza()

**stack**  
1. pizza(3) (calls `pizza(2)`)
2. println()
3. main()

	!Java
	/* precondition: n is a positive integer */
	public static int pizza(int n){
	    if(n == 1){
	        return 1;
	    }
	    return 2*n + pizza(n-1) - 1;
	}
	public static void main(String[] args){
	    System.out.println(pizza(3));
	}
	
---
# Tracing pizza()

**stack**
1. pizza(2) (calls `pizza(1)`)  
2. pizza(3)
3. println()
4. main()

	!Java
	/* precondition: n is a positive integer */
	public static int pizza(int n){
	    if(n == 1){
	        return 1;
	    }
	    return 2*n + pizza(n-1) - 1;
	}
	public static void main(String[] args){
	    System.out.println(pizza(3));
	}

---
# Tracing pizza()

**stack**
1. pizza(1) (returns `1`)
2. pizza(2)   
3. pizza(3)
4. println() 
5. main()

	!Java
	/* precondition: n is a positive integer */
	public static int pizza(int n){
	    if(n == 1){
	        return 1;
	    }
	    return 2*n + pizza(n-1) - 1;
	}
	public static void main(String[] args){
	    System.out.println(pizza(3));
	}

---
# Tracing pizza()

**stack**
1. pizza(2) (returns `2(2) + 1 -  1 = 4`)   
2. pizza(3) 
3. println()
4. main()

	!Java
	/* precondition: n is a positive integer */
	public static int pizza(int n){
	    if(n == 1){
	        return 1;
	    }
	    return 2*n + pizza(n-1) - 1;
	}
	public static void main(String[] args){
	    System.out.println(pizza(3));
	}
	
---
# Tracing pizza()

**stack**
1. pizza(3) (returns `2(3) + 4 -  1 = 9`)  
2. println() 
3. main() 

	!Java
	/* precondition: n is a positive integer */
	public static int pizza(int n){
	    if(n == 1){
	        return 1;
	    }
	    return 2*n + pizza(n-1) - 1;
	}
	public static void main(String[] args){
	    System.out.println(pizza(3));
	}
	
---
# Tracing pizza()

**stack**
1. println(9) (prints 9) 
2. main() 

	!Java
	/* precondition: n is a positive integer */
	public static int pizza(int n){
	    if(n == 1){
	        return 1;
	    }
	    return 2*n + pizza(n-1) - 1;
	}
	public static void main(String[] args){
	    System.out.println(pizza(3));
	}

---
# Tracing pizza()

**stack**
1. main() (program complete) 

	!Java
	/* precondition: n is a positive integer */
	public static int pizza(int n){
	    if(n == 1){
	        return 1;
	    }
	    return 2*n + pizza(n-1) - 1;
	}
	public static void main(String[] args){
	    System.out.println(pizza(3));
	}

---
# Why Does This Work?

1. **Base case:** The method provided a return value for the base case when n is 1. There can be more than 1 base case. 
2. **Recursive call to `pizza(n-1)`:** This ensured that for positive integers greater than 1, would eventually resolve to a call to the base case. 

	!Java
	public static int pizza(int n){
		// base case
		if(n == 1){
			return 1;
		}
		// recursive call
		return 2*n + pizza(n-1) - 1;
	}
	
---
# Textbook Classic: Factorial

* **Iterative Solution**

	!Java
	public int factorial(int n){
		int result = 1;
		for(int i = 2; i <= n; i++){
			result *= i;
		}
		return result;
	}
	
* **Recursive Solution:** Using `1! = 1` as our base case, and the fact that `n! = n*(n-1)!`, we can write the following very elegant solution.

	!Java
	public int factorial(int n){
		if(n == 1){
			return 1;
		}
		return n * factorial(n-1);
	}
  
---
# When to use recursion?

Recursion is a tool in your programmer tool box. It works very really well for certain problems and for others a more direct approach is better. For example:  

**Good Choice: **Generating Fibonacci Numbers. The sequence is defined as the sum of the two *previous* terms (F(n) = F(n-1) + F(n-2), mathematicians call this a **recursive definition**).

![rabbit](honeyBunny.jpg)

---
# When to use recursion?

**Bad Choice: ** My `pizza()` method. You know what would've been a more straight forward solution to that problem?

	!Java
	public int pizza(int n){
		return n * n;
	}

**Recursion Pros and Cons**
--- pros ---|--- cons ---
------------|------------
----elegant----|---confusing----
----
---
# Exit Ticket

