import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 * The purpose of this lab is to count letters in a text document and 
 * store the total number of characters in an output file
 * 
 * 
 * @author amm7100
 *
 */
public class feb29lab {

	
	
	/**
	 * Counts letters in a file and returns the number of characters
	 * 
	 * 
	 * @param args
	 * @return count
	 */
	public static int countLetters(String filename){
		
		int count = 0;
		
		Scanner in = null;
		try 
		{
			in = new Scanner(new File(filename));
			
			while(in.hasNext())
			{
				String letter = in.next();
				for (int i = 0; i < letter.length(); i++) {
					
					if (Character.isLetter(letter.charAt(i)))
				        count++;
					
				}
				
				
				
	
			
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Input file cannot be opened!");
			e.printStackTrace();
		}
		finally
		{
			in.close();
		}
		
		
	
		return count;

		
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		if (args[0] != null && args[1] != null)
		{
			
			String inputFile = args[0];
			String outputFile = args[1];
			
			int numLetters = countLetters(inputFile);
			
			//Print output 
			System.out.println("The input file that is being used Currently has the following: ");
			System.out.println("Letters : " + numLetters);
			
			
			
			
			
	
			PrintWriter out = null;
			try
			{
				out = new PrintWriter(outputFile);
				out.println("Letters: " + numLetters);
				
				
			
				
				
			}
			catch (FileNotFoundException e)
			{
				System.out.println("Output file was not found!");
				e.printStackTrace();
			}
			finally
			{
				out.close();
			}
		}
		else 
		{
			System.out.println("Input and output files must be supplied ");
		}
		
	}
		
}
