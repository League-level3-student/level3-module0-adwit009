package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
		
	
		String[] strings = new String[] {"string 1", "string 2", "string 3", "string 4", "string 5"};
	
	printStrings(strings);
	printStringsBack(strings);
	printStringsEveryOther(strings);
	printStringsRandom(strings);
	}
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings(String [] strings) {
		for (int i = 0; i < strings.length; i++) {
		System.out.println(strings[i]);	
		}
		System.out.println("done");
	}
	
	
	static //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	void printStringsBack(String [] strings) {
		for (int i = strings.length -1 ; i > -1; i--) {
		System.out.println(strings[i]);	
		}
		System.out.println("done");
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printStringsEveryOther(String [] strings) {
		for (int i = 0; i < strings.length; i++) {
		if (i%2 == 0) {
			System.out.println(strings[i]);				
		}
		}
	
		System.out.println("done");
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printStringsRandom(String [] strings) {
String[] stringsCopy = strings; 
int length = stringsCopy.length;
		Random rng = new Random(); 
		for (int i = 0; i < length; i++) {
		int x = rng.nextInt(length - i);

		int y = 0;
		String[] stringsPlaceholder = null;
			System.out.println(stringsCopy[x]);	
			stringsPlaceholder = new String[stringsCopy.length - 1];	
			for (int j = 0; j < stringsCopy.length; j++) {
			
			if (j != x ) {
				stringsPlaceholder[y] = stringsCopy[j];
			y++; 
			}
			
			}
			
		stringsCopy = stringsPlaceholder; 
		}
	}	
}
