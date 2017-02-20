import java.util.ArrayList;
import java.util.Arrays;



/*
Created by: Alex Mammay
Due date: 2/21/16
course: IST 242
Professor: Amber McConahy
Goal: Use arrays, and array list to do a series of tasks
 */
public class homework3 {

	
	/**
	 * Searches the array and returns the smallest value
	 * 
	 * @param a
	 * @return smallest
	 */
	public static int smallest(int [] a){
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
				if (a[i] < smallest){
					smallest = a[i];	
			}
		}
		return smallest;	
	}
	
	
	
	/**
	 * Takes the current array, creates a new version of it and shifts the values to the right.
	 * 
	 * @param a
	 * @return result
	 */
	public static int[] shiftRight(int [] a){
		int[] result = new int [a.length];
		int last = a[a.length -1];
		for (int i = 0; i < a.length -1; i++) {
			result[i + 1 ]= a[i];
		}
		result [0] = last;
		return result;
	
	}
	
	
	/**
	 * Returns a true or false value if the array has duplicates
	 * 
	 * @param a
	 * @return duplicates
	 */
	public static boolean hasDuplicates(int [] a){
		boolean duplicates = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (j!=i && a[i] == a[j]){
					duplicates = true;
				}
					
			}
		}
		
		return duplicates;
		
	}
	
	/**
	 * makes a copy of the array and replace the even numbers with 0s
	 * 
	 * @param a
	 * @return result
	 */
	
	
	public static int[] replaceEvens(int [] a){
		int[] result = Arrays.copyOf(a, a.length);
		for (int i = 0; i < result.length; i++) {
				if(result[i] % 2 == 0){
					result[i] = 0;
					
			}
		}
		return result;
			
	}
	
	
	/**
	 * Copies the array and using the Arrays.sort method, sorts the array.
	 * 
	 * @param a
	 * @return result
	 */
	
	public static int[] sort(int [] a){
		int[] result = Arrays.copyOf(a, a.length);
		
		Arrays.sort(result);
		
		return result;
		
	}
	
	
	/**
	 * Copies the array, takes the highest value number, replaces the value with -1 and then 
	 * takes another new array and removes the result
	 * 
	 * @param a
	 * @return newResult
	 */
	
	public static int[] removeMax(int [] a){
		int[] result = Arrays.copyOf(a, a.length);
		int max = result[0];
		int maxPos = 0;
		
		for (int i = 0; i < result.length; i++) {
				if (a[i] > max){
					max = result [i];	
					maxPos = i +1;
			}
			
		}
		for (int i = maxPos; i < result.length; i++) {
			result[i-1] = a[i];
		}
		
		int[]newResult = Arrays.copyOf(result,(result.length -1));
		
		return newResult;
		
	}
	
	
	
	/**
	 * Takes the array list, finds values that are even and returns them as a 0 value
	 * 
	 * @param list
	 * @return result
	 */
	
	public static ArrayList <Integer> replaceEvens (ArrayList<Integer>list){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0){
				 list.set(i, 0);
				 
				
				}
			result.add(list.get(i));
		}
		
			
		return result;
		
	}
	
	/**
	 * Shifts the values of the array list to the right
	 * 
	 * @param list
	 * @return result
	 */
	
	
	public static ArrayList <Integer> shiftRight (ArrayList<Integer>list){
			ArrayList<Integer> result = new ArrayList<Integer>();
			int last = list.get(list.size() -1 );
			
			for (int i = 1; i < list.size(); i++) {
				result.add(list.get(i - 1));
			
			}
		result.add(0,last);
		return result;
		
	}
	
	/**
	 * Removes the highest value inside the array list a
	 * 
	 * @param list
	 * @return result
	 */
	
	
	public static ArrayList <Integer> removeMax (ArrayList<Integer>list){
		ArrayList<Integer> result = new ArrayList<Integer>(list);
		//ArrayList<Integer> copy = new ArrayList<Integer>(list);
			
		int maxPos =0;
		int max = result.get(0);
		
		
		
		for(int i = 0; i < result.size(); i++) {
			   if(result.get(i) > max) {
			      max = result.get(i);
			      maxPos = i;
			   }
			
		}
		result.remove(maxPos);
		return result;
	}
	
	/**
	 * supply 2 separate arrays and an array list and calls for each method to be used
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {1, 5, 3, 7, 6, 0, 2, 10, -1};
		int[] dups = {2, 2, 5, 4, 4, 3, 6, 6, 7, 2, 2};
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(5);
		myList.add(2);
		myList.add(9);
		myList.add(4);
		//Smallest number
		System.out.println("Smallest Number is "+ smallest(myArray));
		//Shift array to right
		System.out.println("Shifted Right = " + Arrays.toString(shiftRight(myArray)));
		//Shit arraylist to the right
		System.out.println("List Shifted Right = " +shiftRight(myList));
		//Replace array evens with 0s
		System.out.println("Replace Evens = " +Arrays.toString(replaceEvens(myArray)));
		//remove the highest number in the array
		System.out.println("Removed Highest number: " +Arrays.toString(removeMax(myArray)));
		//Duplicates
		System.out.println("Does myArray have Duplicates: " +hasDuplicates(myArray));
		System.out.println("Does dups have Duplicates: " +hasDuplicates(dups));
		
		//sort
		System.out.println("Sorted array: " +Arrays.toString(sort(myArray)));
		//removemax using list
		System.out.println("List with removed Max number: " +removeMax(myList));
				
				
		//replaceevens with array list
		System.out.println("List Repleace Evens = " +replaceEvens(myList));
		
		
	}

}
