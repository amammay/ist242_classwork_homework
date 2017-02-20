import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * Homework 4 - Computing a documents readability 
 * 
 * This program will compute the readability of a file
 * and then output the number of sentences, words, syllables 
 * and index to an output file. 
 * 
 * @author alex mammay
 *
 */
public class homework4_alexMammay 
{
	/**
	 * Counts sentences in a file and returns number of sentences
	 * @param filename = file to count sentences
	 * @return number of sentences
	 */
	public static int countSentences(String filename)
	{
		int count = 0;
		
		Scanner in = null;
		try 
		{
			in = new Scanner(new File(filename));
			
			while(in.hasNext())
			{
				String word = in.next();
				char[] ch = {'!', '?', '.', ';', ':'};
				
				if (word.charAt(word.length() - 1) == '!' || 
					word.charAt(word.length() - 1) == '?' || 
					word.charAt(word.length() - 1) == '.' || 
					word.charAt(word.length() - 1) == ';' ||
					word.charAt(word.length() - 1) == ':')
				{
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
	 * Counts words in a file and returns number of words
	 * @param filename = file to count words
	 * @return number of words
	 */
	public static int countWords(String filename)
	{
		
		int count = 0;
		
		Scanner in = null;
		try 
		{
			in = new Scanner(new File(filename));
			
			while(in.hasNext())
			{
				in.next();
				count++;
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
	 * Counts syllables in a file and returns number of syllables
	 * @param filename = file to count syllables
	 * @return number of syllables
	 */
	
	public static int countSyllables(String filename)
	{
		int count = 0;
		
		Scanner in = null;
		try 
		{
			in = new Scanner(new File(filename));
			
			while(in.hasNext())
			{
				String eachletter = in.next();
				
				int endLetter = eachletter.length()-1;
				
				
				boolean insideVowelGroup = false;
		        for (int i = 0; i <= endLetter; i++)
		        {
		            String letter = eachletter.substring(i, i + 1);
		            if ("aeiouy".contains(letter))
		            {
		                
		                if (!insideVowelGroup)
		                {
		                   
		                    count++;
		                    insideVowelGroup = true;
		                }
		            }
		            else 
		            {
		                insideVowelGroup = false;
		            }
		        }
		    	
		        if (eachletter.endsWith("e"))
				{
		    		endLetter--;
				}
				
			
				
				if ( count ==0 )
				{
					count = 1 ;
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
	 * Calculates the readability index of a file 
	 * @param sentences = number of sentences
	 * @param words = number of words
	 * @param syllables = number of syllables
	 * @return
	 */
	public static double calculateIndex(int sentences, int words, int syllables)
	{
		
		double index = 206.835 - 84.6 * ((double)syllables/(double)words) - 1.05 * ((double)words/(double)sentences);
	
		return index;
		
	}
	
	
	
	
	/**
	 * Main method, calls for methods to be used, displays the outputs.
	 * @param args[0] = input file
	 * @param args[1] = output file
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("The readability of the input file is determined by the following scale: \n");
		System.out.println("Comics:                95");
		System.out.println("Consumer Ads:          82");
		System.out.println("Sports Illustrated:    65");
		System.out.println("Time:                  57");
		System.out.println("New York Times:        39");
		System.out.println("Auto insurance policy: 10");
		System.out.println("Internal Revenue Code:  6");
		
	
		if (args[0] != null && args[1] != null)
		{
			
			String inputFile = args[0];
			String outputFile = args[1];
			
			int numSentences = countSentences(inputFile);
			int numWords = countWords(inputFile);
			int numSyllables = countSyllables(inputFile); 
			double index = calculateIndex(numSentences, numWords, numSyllables);
			
			//Print output 
			System.out.println("The input file that is being used Currently has the following: ");
			System.out.println("Words: " + numWords);
			System.out.println("Syllables: " + numSyllables);
			System.out.println("Sentences: " + numSentences);
			System.out.println("Index: " + index);
			
			if (index >= 95)
			{
				System.out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
						           ") is Comics level!");
			}
			else if (index >= 82 && index < 95)
			{
				System.out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
							       ") is Consumer Ads level!");
			}
			else if (index >= 65 && index < 82)
			{
				System.out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
								   ") is Sports Illustrated level!");
			}
			else if (index >= 57 && index < 65)
			{
				System.out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
								   ") is Time level!");
			}
			else if (index >= 39 && index < 57)
			{
				System.out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
						           ") is New York Times level!");
			}
			else if (index >= 10 && index < 39)
			{
				System.out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
						           ") is Auto Insurance Policy level!");
			}
			else if (index >= 6 && index < 10)
			{
				System.out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
						           ") is Internal Revenue Code level!");
			}
			else 
			{
				System.out.println("The index is too low.");
			}
			
			
			
			
			
			
			PrintWriter out = null;
			try
			{
				out = new PrintWriter(outputFile);
				out.println("Words: " + numWords);
				out.println("Syllables: " + numSyllables);
				out.println("Sentences: " + numSentences);
				out.println("Index: " + index);
				
				if (index >= 95)
				{
					out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
							           ") is Comics level!");
				}
				else if (index >= 82 && index < 95)
				{
					out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
								       ") is Consumer Ads level!");
				}
				else if (index >= 65 && index < 82)
				{
					out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
									   ") is Sports Illustrated level!");
				}
				else if (index >= 57 && index < 65)
				{
					out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
									   ") is Time level!");
				}
				else if (index >= 39 && index < 57)
				{
					out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
							           ") is New York Times level!");
				}
				else if (index >= 10 && index < 39)
				{
					out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
							           ") is Auto Insurance Policy level!");
				}
				else if (index >= 6 && index < 10)
				{
					out.println("The index calculated (" + (Math.round(index * 100.00) / 100.00) + 
							           ") is Internal Revenue Code level!");
				}
				else 
				{
					out.println("The index is too low.");
				}
				
				
				
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