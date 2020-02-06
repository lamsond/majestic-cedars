# Sorting (Part 1)
---

# Lab Recap

During the Runtime Lab we should have discovered:

1. Binary Search is considerably faster than Linear Search (especially as the size of our array increases).
2. The time it takes to sort however, is much longer than Linear Search. This makes Linear Search more efficient than Binary Search if we are only searching an array one time.

---
# Algorithmic Efficiency

This efficiency can be quantified using something called `Big Oh` notation (not on AP exam). Big Oh describes how the runtime of an algorithm will increase as the array size (n) increases.

Efficiency | Meaning        
---------- | -------- 
O(1) | Takes a constant amount of time regardless of the size of n.
O(log(n)) | Time increases with n, however more slowly than linear (e.g. Binary Search)
O(n) | Increases linearly (e.g. Linear Search)
O(n*log(n)) | Increases with n, faster than linear (e.g. `Arrays.sort()`)
O(n^2) | Increases to the square of n. (e.g. Insertion Sort, Selection Sort)
O(2^n) | Increases exponentially

![big oh graphs](https://cooervo.github.io/Algorithms-DataStructures-BigONotation/images/graphs/comparison.svg)

---
# Sort Algorithms for the AP Exam

1. Selection Sort (`O(n^2)`) - Today
2. Insertion Sort (`O(n^2)`) - Today
3. Merge Sort (`O(n*log(n))`) - Chapter 10 (Recursion)

**note: **the `n^2` runtime comes from the fact that selection/insertion rely on *double loops*, resulting in having to iterate through n things n times.  

![big oh graphs](https://cooervo.github.io/Algorithms-DataStructures-BigONotation/images/graphs/comparison.svg)

---
# Selection Sort Pseudo-code

	!Java
	for each position in the array
		find the minimum value from the current position to the end of the array.  
		if the minimum is not at the current position
			swap the current and the min
		move to the next position in the array.

**Simulation**  
[http://www.cs.armstrong.edu/liang/animation/web/SelectionSort.html](http://www.cs.armstrong.edu/liang/animation/web/SelectionSort.html)

---
# Selection Sort Names

---

# Insertion Sort Pseudo-code

	!Java
	for each position in the array (start @ index 1)
		insert the current value into order relative to the sorted values on its left.
		move to the next position in the array.

**Simulation**  
[https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/](https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/)
---
# Insertion Sort Names

---

# LAB-027

Implement these algorithms with the following `static void` methods

1. `selectionSort()`: takes an ArrayList of names and puts them into alphabetical order using the selection sort algorithm. (see `compareTo()` if stuck on how to order)
2. `insertionSort()`: takes an ArrayList of names and puts them into alphabetical order using the insertion sort algorithm.
3. `shuffle()`: takes an ArrayList of names and puts them into a random order. (see `Knuth shuffle` if you get stuck)

**Notes: **  

* You may use the starter/test code posted to Classroom to get started  
* Try to code these algorithms on your own before resorting to Google. It's worth the effort.  
* Google the `compareTo()` method to review how to put Strings in order.  
* Your shuffle code needs to randomize the order, but doesn't have to be *mathematically perfect* (every permutation is equally likely)  
  
---
# Sample Output
When your code is working you should get something like this:   
![console screenshot](/home/conrad/Pictures/sampleOutputPer1.png)
