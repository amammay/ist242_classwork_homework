/**
 * 
 */

/**
 * @author evanmcstay
 * implements comparable shows off the compareTo method
 */
public abstract class Square extends Shape implements Comparable
{
	private int length;
	private int width;
	


	
	/**
	 * @param length
	 * @param width
	 */
	public Square(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	/**
	 * 
	 */
	public Square() 
	{
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Square [length=" + length + ", width=" + width + ", toString()=" + super.toString() + "]";
	}


	/* (non-Javadoc)
	 * @see Shape#getDimensions()
	 */
	@Override
	public void getDimensions() 
	{
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
	}
	
	public int compareTo(Object arg0)
	{
		Square s = (Square) arg0;
		int area = s.length * s.width;
		int area2 = this.length * this.width;
		
		if (area2 > area)
		{
			return 1;
		}
		else if (area2 < area)
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Square s = new Square(3,5);
		s.getDimensions();
		s.printShape();
		s.toString();
		
		//compares the two strings
		//returns 0
		Square s2 = new Square(5,3);
		System.out.println(s.compareTo(s2));
		//returns -1
		Square s3 = new Square(6,3);
		System.out.println(s.compareTo(s2));

	}
}
