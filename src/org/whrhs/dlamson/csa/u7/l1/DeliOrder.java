package org.whrhs.dlamson.csa.u7.l1;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliOrder {
	
	static ArrayList<String> customers = new ArrayList<>();
	static final String VIP = "Mrs. Lamson";
	static Scanner scan = new Scanner(System.in);
	
	static void printNames() {
		for(int i = 0; i < customers.size(); i++) {
			System.out.println(i + 1 + ". " + customers.get(i));
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		int userSelect = 0;
		int removeIndex = -1;
		String name = "";
		
		while(true) {
			printNames();
			System.out.print("1) Add a new customer\n"
					+ "2) Remove a customer\n"
					+ "3) Complete an Order\n"
					+ "4) Quit\n\n"
					+ "Select an option: ");
			userSelect = Integer.parseInt(scan.nextLine());
			if(userSelect == 1) {
				System.out.print("Enter Customer Name: ");
				name = scan.nextLine();
				if(name.equals(VIP)) {
					customers.add(1, name);
				}
				else {
					customers.add(name);
				}
			}
			else if(userSelect == 2) {
				if(customers.size() == 0) {
					System.out.println("No Customers to Remove");
				}
				else {
					while(true) {
						System.out.print("Enter the position of the customer to remove: ");
						removeIndex = Integer.parseInt(scan.nextLine()) - 1;
						if(removeIndex >= 0 && removeIndex < customers.size()) {
							break;
						}
						else {
							System.out.println("Invalid Position");
						}					
					}
					customers.remove(removeIndex);
				}
			}
			else if(userSelect == 3) {
				if(customers.size() == 0) {
					System.out.println("No Orders to Complete");
				}
				else {
					System.out.println("\nOrder Completed");
					customers.remove(0);
				}
			}
			else if(userSelect == 4) {
				System.out.println("Have a nice day!\n");
				break;
			}
			else {
				System.out.println("Invalid Option");
			}
			System.out.println("");
		}
	
	}
	
}
