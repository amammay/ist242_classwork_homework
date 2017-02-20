/**
 * 
 */

/**
 * @author evanmcstay
 * shows off abstract classes
 */
public abstract class Shape 
{

	public abstract void getDimensions();
	
	public abstract void printShape();

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shape []";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
