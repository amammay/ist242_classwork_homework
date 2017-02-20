/**
 * 
 */

/**
 * @author evanmcstay
 *
 */
public class SavingsAccount extends Account 
{
	private double interest;
	
	/**
	 * 
	 */
	public SavingsAccount() 
	{
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param balance
	 * @param interest
	 */
	public SavingsAccount(double balance, double interest) 
	{
		super(balance);
		this.interest = interest;
	}
	
	/**
	 * @param balance
	 */
	public SavingsAccount(double balance) 
	{
		super(balance);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(interest);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
		{
			return true;
		}
		if (!super.equals(obj))
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		
		SavingsAccount other = (SavingsAccount) obj;
		
		if (Double.doubleToLongBits(interest) != Double.doubleToLongBits(other.interest))
		{
			return false;
		}
		
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		//super.toString() makes it cleaner to print out
		return super.toString() + "[interest=" + interest + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SavingsAccount s = new SavingsAccount(500, .04);
		System.out.println("s:" + s.toString());
		
		//compares to see if s2 equals s
		SavingsAccount s2 = new SavingsAccount(500, .04);
		System.out.println(s.equals(s2));
	}

}
