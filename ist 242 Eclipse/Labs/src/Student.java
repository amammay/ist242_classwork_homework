/**
 * 
 */

/**
 * @author amm7100
 *
 */
public class Student {

	private String name;
	private int id;
	private static int count = 0;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
		
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @param name
	 * @param id
	 */
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		count++;
		
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student alex = new Student("Alex", 1);
		Student bill = new Student("Bill", 2);
		alex.setId(3);
		System.out.println(alex.getName()+ " ID: " + alex.getId());
		System.out.println(bill.getName()+ " ID: " + bill.getId());
		System.out.println("Count: " + count);
		
	}

}
