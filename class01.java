/**
 * Name: Nishant Pokhrel 
 * Date: September 5, 2021 
 * Subject: CS 216- Data Structures & Algorithms 
 * Assignemt: Week01 
 * Purpose: This program removes string from a bag and 
 * add vowel strings to other bag.
 * 
 * @author npokhrel
 */
public class class01 {

	public static void main(String[] args) 
	{

		// creating a bag letters
		Bag<String> letters = new Bag<String>();

		// adding one letter strings to the bag letters.

		letters.add("n");
		letters.add("i");
		letters.add("s");
		letters.add("h");
		letters.add("a");
		letters.add("n");
		letters.add("t");
		letters.add("p");
		letters.add("o");
		letters.add("k");
		letters.add("h");
		letters.add("r");
		letters.add("e");
		letters.add("l");

		// creating a current string to hold above added one-letter strings
		String current;

		// creating a bag vowels
		Bag<String> vowels = new Bag<String>();

		/**
		 * Initiating a while loop to remove strings from bag letters until it is empty
		 * and adding to bag vowels if it matches a given criteria.
		 */

		while (!letters.isEmpty()) 
		{

			current = letters.remove(); // removing strings from bag letters

			if (current.equals("a") || current.equals("e") || 
				current.equals("i") || current.equals("o") ||
				current.equals("u"))

				vowels.add(current); // adding vowel strings to the bag vowel

		} // closing the loop
		
		/**
		 * Printing size of bag vowels and all other individual instance of vowel
		 * letters in the bag.
		 */
		System.out.println("Bag vowels has " + vowels.getCurrentSize() + " vowel letters.");
		System.out.println("--------------------------------");
		System.out.println("There are " + vowels.getFrequencyOf("a") + " a in the bag vowels.");
		System.out.println("There are " + vowels.getFrequencyOf("e") + " e in the bag vowels.");
		System.out.println("There are " + vowels.getFrequencyOf("i") + " i in the bag vowels.");
		System.out.println("There are " + vowels.getFrequencyOf("o") + " o in the bag vowels.");
		System.out.println("There are " + vowels.getFrequencyOf("u") + " u in the bag vowels.");

	}

}
