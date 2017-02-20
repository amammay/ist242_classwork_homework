/**
 * 
 */

/**
 * @author evanmcstay
 * Shows off the equals, hashCode, and toString()
 */
public class Account 
{
	private double balance;
	
	/**
	 * 
	 */
	public Account() 
	{
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param balance
	 */
	public Account(double balance) 
	{
		super();
		this.balance = balance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
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
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return getClass().getName() + "[balance=" + balance + "]";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account a = new Account(500);
		System.out.println("a: " + a.toString());
		//tests to see if a equals a2
		Account a2 = new Account(500);
		System.out.println(a2.equals(a2));
	}
}
