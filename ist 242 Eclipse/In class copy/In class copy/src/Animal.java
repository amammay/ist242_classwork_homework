/**
 * 
 */

/**
 * @author evanmcstay
 * This program will show off Inheritance 
 */
public class Animal 
{
	private char gender;
	private String name;
	private String sound;
	
	/**
	 * @param gender
	 * @param name
	 * @param sound
	 * Made with source - generate constructor using fields
	 */
	public Animal(char gender, String name, String sound) {
		super();
		this.gender = gender;
		this.name = name;
		this.sound = sound;
	}
	
	public String makeSound()
	{
		return sound;
	}
	
	public String getName()
	{
		return name;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [gender=" + gender + ", name=" + name + ", sound=" + sound + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		

	}

}
