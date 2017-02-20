/**
 * 
 */

/**
 * @author amm7100
 * Created By: Alex Mammay
 * Class: IST 242
 * Professor Amber McConahy
 * Goal: Create cell phone plan calculator that decides which plan is a better deal
 * 
 */
import java.util.Scanner;
public class Lab1_phones {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	
		
		//declares variables that are needed for whole class
		int minutesUsed= 0;
		int messagesUsed= 0;
		int megabytesUsed= 0;
		
		
		
		
		// variables needed for the first plan inputed
		String planName1;
		double phoneCost =0.0;
		double monthlyPlanFee=0.0;
		int Minutes=0;
		int messages=0;
		int megabytes=0;
		double feeMinutes=0.0;
		double feeMessages=0.0;
		double feeMegabytes=0.0;
		
		// variables needed for the second plan inputed
		String planName2;
		double phoneCost2 = 0.0;
		double monthlyPlanFee2=0.0;
		int Minutes2=0;
		int messages2=0;
		int megabytes2=0;
		double feeMinutes2=0.0;
		double feeMessages2=0.0;
		double feeMegabytes2=0.0;
		
		
		
		//activate scanner
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		//usage
		System.out.println("Usage \n");
		System.out.println("Please enter your minutes used: ");
		minutesUsed = reader.nextInt();
		System.out.println("Please enter your messages sent: ");
		messagesUsed = reader.nextInt();
		System.out.println("Please enter data in megabytes used: ");
		megabytesUsed = reader.nextInt();
	
		// first plan inputs
		System.out.println("Please enter Plan Name: \n");
		planName1 = reader.next();
		System.out.println("Please enter the cost of your Phone: \n");
		phoneCost = reader.nextDouble();
		System.out.println("Please enter Monthly fee: \n");
		monthlyPlanFee = reader.nextDouble();
		System.out.println("Please enter amount of Free Minutes: \n");
		Minutes = reader.nextInt();
		System.out.println("Please enter amount of Messages you can send/recieve: \n");
		messages = reader.nextInt();
		System.out.println("Please enter amount of data in megabytes you can use: \n");
		megabytes = reader.nextInt();
		System.out.println("Please enter fee for going over Minutes allowed: \n");
		feeMinutes = reader.nextDouble();
		System.out.println("Please enter fee for going over Messages sent/recieved: \n");
		feeMessages = reader.nextDouble();
		System.out.println("Please enter fee for going over Data usage: \n");
		feeMegabytes = reader.nextDouble();
		
		//second plan inputs
		System.out.println("Please enter Plan Name: \n");
		planName2 = reader.next();
		System.out.println("Please enter the cost of your Phone: \n");
		phoneCost2 = reader.nextDouble();
		System.out.println("Please enter Monthly fee: \n");
		monthlyPlanFee2 = reader.nextDouble();
		System.out.println("Please enter amount of Free Minutes: \n");
		Minutes2 = reader.nextInt();
		System.out.println("Please enter amount of Messages you can send/recieve: \n");
		messages2 = reader.nextInt();
		System.out.println("Please enter amount of data in megabytes you can use: \n");
		megabytes2 = reader.nextInt();
		System.out.println("Please enter fee for going over Minutes allowed: \n");
		feeMinutes2 = reader.nextDouble();
		System.out.println("Please enter fee for going over Messages sent/recieved: \n");
		feeMessages2 = reader.nextDouble();
		System.out.println("Please enter fee for going over Data usage: \n");
		feeMegabytes2 = reader.nextDouble();
		
		
		
		
		
		
		
		//calculating first plans monthly cost
		double monthlyCost1 = 0.0;
		double monthlyFee1 = 0.0;
		
		if (minutesUsed > Minutes)
			{
				monthlyFee1 += ((minutesUsed - Minutes)* feeMinutes);
			}
		if (messagesUsed > messages)
			{
				monthlyFee1 += (( messagesUsed - messages) * feeMessages);	
			}
		if (megabytesUsed > megabytes)
			{
				monthlyFee1 += ((megabytesUsed - megabytes)* feeMegabytes);	
			}
		monthlyCost1 = (  phoneCost / 24) + monthlyFee1 + monthlyPlanFee;
		System.out.println("$" +monthlyCost1);
		
		
		//calculating second plans monthly cost
		double monthlyCost2 = 0.0;
		double monthlyFee2 = 0.0;
		if (minutesUsed > Minutes2)
			{
				monthlyFee2 += ((minutesUsed - Minutes2) * feeMinutes2);
			}
		if (messagesUsed > messages2)
			{
				monthlyFee2 += (( messagesUsed - messages2) * feeMessages2);	
			}
		if (megabytesUsed > megabytes2)
			{
				monthlyFee2 += ((megabytesUsed - megabytes2)* feeMegabytes2);	
			}
		
		monthlyCost2 = ( phoneCost2 / 24) + monthlyFee2 + monthlyPlanFee2;
		System.out.println("$" +monthlyCost2);
		
		
		
		
		
		if (monthlyCost1 < monthlyCost2)
			{
				System.out.println("The cheaper plan is " +planName1 +" at $" +monthlyCost1 +" per month" );
			}
		
		else if (monthlyCost1 > monthlyCost2)
			{
				System.out.println("The cheaper plan is " +planName2 +" at $" +monthlyCost2 +" per month" );
			}
		
		
		
		
		
		reader.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}


                                                                   