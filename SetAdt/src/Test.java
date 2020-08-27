
/* 
 Name: Kathryn von Schlegell
 Course: CPSC 50100
 Semester: Summer 2020
 Assignment: Set ADT */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out
				.println("Programming Fundamentals \nNAME: Kathryn von Schlegell \nPROGRAMMING ASSIGNMENT 4 - SET \n");

		Set set = new Set();
		// Unable to close due to infinite loop. Suppressing warning.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int inputNumber = 0;

		while (true) {
			// Having user enter command.
			// String the choice
			// Splitting out the space and then put the number as an integer
			System.out.print("Enter command: ");
			String commandChoice = input.nextLine();
			commandChoice = commandChoice.toLowerCase();
			String[] command = commandChoice.split(" ");

			try {
				inputNumber = Integer.parseInt(command[1]);
				
			// Catching if no space between command and number
			} catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
				System.out.println("Invalid command");
				continue;
		
			} catch (NumberFormatException exception) {
				System.out.println("Invalid number");
				continue;
			}

			if (command[0].equals("add")) {
				set.add(inputNumber);
			} else if (command[0].equals("del")) {
				set.delete(inputNumber);

			} else if (command[0].equals("exists")) {
				System.out.println(set.exists(inputNumber));
			} else {
				System.out.println("Invalid input. Please enter add x, del x or exists x. (x is an integer)" + "\n"
						+ set.toString());
			}
		}
	}

}
