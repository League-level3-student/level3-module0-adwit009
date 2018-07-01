package _00_IntroToArrays;

import java.util.Random;



public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] array = new String[]{ "hi1", "hi2","hi3","hi4","hi5" };

		//2. print the third element in the array
System.out.println(array[2]);
		//3. set the third element to a different value
System.out.println((array[2] = "hidiff"));
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < array.length; i++) {
			array[i] = "this is different";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//7. make an array of 50 integers
int[] intray = new int[50];
for (int i = 0; i < intray.length; i++) {
	intray[i]= i;
}
		//8. use a for loop to make every value of the integer array a random number
Random rand = new Random();

for (int i = 0; i < intray.length; i++) {
	intray[i]= rand.nextInt(100);
}
		
//9. without printing the entire array, print only the smallest number on the array
int smallest = intray[0];
for (int i = 0; i < intray.length; i++) {
	if (smallest > intray[i]) {
		smallest = intray[i];
	} 
}
System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i < intray.length; i++) {
	System.out.println(intray[i]);
}
		//11. print the largest number in the array.
int largest = intray[0];
for (int i = 0; i < intray.length; i++) {
	if (largest < intray[i]) {
		largest = intray[i];
	} 
}



System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(intray[intray.length -1 ]);
	}
}
