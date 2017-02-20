/**
 * 
 */

/**
 * @author evanmcstay
 * shows off polymorphism
 */
public class Main extends Animal {

	/**
	 * @param gender
	 * @param name
	 * @param sound
	 */
	public Main(char gender, String name, String sound) {
		super(gender, name, sound);
		// TODO Auto-generated constructor stub
	}
	
	//polymorphism method decides which version to use when the parameters are passed 
	//Polymorphism allows the parent class to recognize all the children classes
	//if you did not have the parent class then the child could only access the class
	//ex. if you had dog in printType you would only be able to access the dog child
	public static void printType(Animal a)
	{
		System.out.println(a.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Prints the Dog and the parameters
		Dog d = new Dog('M',"Rover","Roof");
		printType(d);
		
		//prints only the F and that it is an animal
		Animal a = new Animal('f', null, null);
		printType(a);
		

	}

}
