/**
 * 
 */

/**
 * @author evanmcstay
 *
 */
public class Dog extends Animal 
{

	/**
	 * @param gender
	 * @param name
	 * @param sound
	 */
	public Dog(char gender, String name, String sound) 
	{
		super(gender, name, sound);
	}

	public String makeSound()
	{
		//would only need this if you do something below 
		//Only override the subclass if you want to do something different like bark
		String s = super.makeSound();
		s+= " Bark";
		return s;
	}
	
	public void playFetch()
	{
		//This can only be called in the child (DOG) and not the parent (ANIMAL)
		System.out.println("Playing fetch");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [toString()=" + super.toString() + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Dog d = new Dog('M',"Fido","Bark");
		System.out.println(d.toString());
		//prints Bark Bark
		System.out.println(d.makeSound());
		//prints M
		System.out.println(d.getGender());
		//prints out playingFetch
		d.playFetch();
		

	}

}
