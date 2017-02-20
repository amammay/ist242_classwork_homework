import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */
/**
 * @author amm7100
 *
 */
public class IO {
	static int count = 0;
	
	public static int readData(String filename) throws FileNotFoundException{
		Scanner in = new Scanner(new File(filename));
		while(in.hasNext()){
			String input = in.next();
			System.out.println(input);
			count++;
			
			
		}
		retrun count;
		
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			readData(args[0]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
