import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class april18 {

	public april18() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<Integer> sort(ArrayList<Integer> myList)
	{
		Collections.sort(myList);
		return myList;
	}
	
	public static int search(ArrayList<Integer> myList, int i)
	{
		int position;
		position = Collections.binarySearch(myList, i);
		return position;		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(2);
		myList.add(1);
		myList.add(8);
		myList.add(4);
		myList.add(22);
		myList.add(15);
		
		sort(myList);
		System.out.println("Array List sorted numericaly: " + myList);
		System.out.println("Please enter for a number to search for: ");
		
		int i;
		int position;
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		position = search(myList, i);
		
		if (position >= 0 || position <= myList.size())
			{
			System.out.println("Value of " + i + " is located at " + position);
			}
		else
			{
				System.out.println("Value not valid");
			}
	}

}