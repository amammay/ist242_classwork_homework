/**
 * 
 */

/**
 * @author evanmcstay
 * Make sure you add in the superclass
 */
public class Cat extends Animal 
{
	private String color;

	/**
	 * @param gender
	 * @param name
	 * @param sound
	 */
	public Cat(char gender, String name, String sound, String color) 
	{
		super(gender, name, sound);
		//
		this.color = color; 
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [color=" + color + ", toString()=" + super.toString() + "]";
	}

	//The method will not be overridden even though dog has play fetch because
	//they're different children of the same adult 
	public void playFetch()
	{
		System.out.println("Cats can't play fetch");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Cat c = new Cat('F', "Scratch", "Meow", "Black");
		System.out.println(c.toString());
		c.playFetch();

	}

}
