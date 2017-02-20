/**
Created by: Alex Mammay
Due date: 2/14/16
course: IST 242
Professor: Amber McConahy
Goal:Create a test grade average calculator

 */


import java.util.Scanner;

public class Homework2 {

	/**
	 * @param args
	 * This function initializes the scanner, also assigns double data types 
	 * to the scores the user inputs. The program prompts the user for 
	 * the test scores and the user inputs a number.
	 * Next the program calls the calculateAverage function to compute the average.
	 * After the values are returned the program outputs the average.
	 * 
	 */
	public static void main(String[] args) {
		
		//initializes scanner reader
		Scanner reader = new Scanner(System.in);
		
		double score1 = 0.0;
		double score2 = 0.0;
		double score3 = 0.0;
		
		
		
		//prompts user for inputs and records the inputs
		System.out.println("Please input values greater than 0 and less then or equal to 100");
		System.out.println("Please enter your first of 3 test scores: \n");
		score1 = reader.nextDouble();
		System.out.println("Please enter your second of 3 test scores: \n");
		score2 = reader.nextDouble();
		System.out.println("Please enter your last test score: \n");
		score3 = reader.nextDouble();
		
		
		//sends values to calculateAverarage function
		double avg = calculateAverage(score1, score2, score3);
		
		
		//All of these IF statements check to see if the average is within a certain grade range
		//Example if the average is 85 the user would get an B
		
		if( avg >= 90 && avg<= 100 ){
			System.out.println("You got an A and your average is "+avg+"\n");
		}
		if( avg >= 80 && avg<= 89 ){
			System.out.println("You got an B and your average is "+avg+"\n");
		}
		if( avg >= 70 && avg<= 79 ){
			System.out.println("You got an C and your average is "+avg+"\n");
		}
		if( avg >= 60 && avg<= 69 ){
			System.out.println("You got an D and your average is "+avg+"\n");
		}
		if( avg >= 0 && avg<=59){
			System.out.println("You got and F and your average is " +avg +"\n");
		}
		
		//next two else if statements check to see if the average is less than 0 or greater than 100
		//if so then the user gets an invalid score error
		
		else if( avg <0)
		{
			System.out.println("Invalid score");
		}
		
		else if( avg > 100)
		{
			System.out.println("Invalid score");
		}
		
		
		
		
		
		
	
		
		reader.close();
		
		
		
		
		
	}
/**
 * This function calculates the scores given by the user
 * into an average. It then returns the average value.
 * 
 * 
 * 
 */
	public static double calculateAverage(double score1, double score2, double score3){
		double average = 0.0;
		final double NUM_SCORES =3;
		
		average = ((score1 +score2+ score3) / NUM_SCORES);
				
		
		return average;
		
	}
	
	
}
