/**
 * 
 */

/**
 * @author amm7100
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int m= 5;
		
		int mystery = mystery( n,  m);
		
		
		System.out.println(mystery);

		
	}
	
	public static int mystery(int n, int m){
		
		if ( n==0){
			return 0;
		}
		if ( n== 1){
			return m;
			
		}
		
		return m + mystery(n-1,m);
		
		
	}

}
