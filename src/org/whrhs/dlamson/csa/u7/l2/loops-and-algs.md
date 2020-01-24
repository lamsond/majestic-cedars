# Write a static method that increases every integer in an ArrayList by a given amount. Pass the ArrayList and amount to increase by as parameters to the method. Modify the given list, don't return anything. 

---
# For Each loop - Concurrent Modification Exception

---
# Remove All Occurances - Attempt 1 

##Write a static method that removes all occurances of a particular number in a ArrayList. Pass the list and number to remove as parameters. Modify the given list, don't return anything.

### Imperfect Solution

	!Java


1. Find an example of a list that this algorithm will work for.
2	public static void removeAllOccurances(ArrayList<Integer> list, int valueToRemove){
	    for(int i = 0; i < list.size(); i++){
	        if(list.get(i) == valueToRemove){
	            list.remove(i);
	        }
	    }
	}. Find an example of a list that this algorithm will **not** work for.

---
# Remove All Occurances - Attempt 2

## Write a static method that removes all occurances of a particular number in a ArrayList. Pass the list and number to remove as parameters. Modify the given list, don't return anything.

---
# LAB-025
 
## Prime Number Game Add-on

Modify the given FRQ code from Exam #3 as follows.

* Allow the player to continuously play the game as many times as they want.
* Declare static ArrayLists to store the scores and names of the players.
* Everytime a player's game ends, record their score and name in the associated lists (make sure indices match). Ask for the player's name each round of the game.
* Write a method that finds the index of the highest score in the list. Do not reorder the list. You can decide how to handle duplicates (perhaps you accept the first occurance as the "highest")
* Let a player know if they establish a new record.
* When the player quits let them know the name of the player with the high score and their score.