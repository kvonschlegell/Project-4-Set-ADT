/* 
 Name: Kathryn von Schlegell
 Course: CPSC 50100
 Semester: Summer 2020
 Assignment: Set ADT */

public class Set {
	LinkedNode firstNumber;

	Set() {
		firstNumber = null;
	}

	public void add(int x) {
		// calling on the exists method to make sure the number is not already in the
		// list before adding.
		if (exists(x) == false) {
			LinkedNode newNode = new LinkedNode(x);
			newNode.next = firstNumber;
			firstNumber = newNode;
		}
		System.out.println(toString());
	}

	public void delete(int x) {
		LinkedNode currentNumber = firstNumber;
		LinkedNode previousNumber = null;
		// using exists method to make sure the number exists in the list before cycling
		// through the loop
		if (exists(x)) {
			while (currentNumber != null) {
				if (currentNumber.x == x) {
					if (previousNumber != null) {
						previousNumber.next = currentNumber.next;
					} else {
						// previous number is null
						firstNumber = currentNumber.next;
					}
					break;
				}
				// keeping track of numbers as the loop iterates through
				previousNumber = currentNumber;
				currentNumber = currentNumber.next;
			}
		}
		System.out.println(toString());
	}

	boolean exists(int x) {

		boolean exists = false;
		LinkedNode currentNumber = firstNumber;
		while (currentNumber != null) {
			if (currentNumber.x == x) {
				exists = true;
			}
			currentNumber = currentNumber.next;
		}

		return exists;
	}

	public String toString() {
		String str = "";

		LinkedNode currentNumber = firstNumber;
		while (currentNumber != null) {
			str += currentNumber.x + " ";
			currentNumber = currentNumber.next;
		}
		return str;
	}
}
