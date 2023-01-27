package interviewprograms;

public class TryCatch {

	public static void main(String[] args) {
		int a=10,b=0, c;
		//	System.out.println(a/b);
		try {
			c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			
			System.out.println("Artithmetic expression exception");			
		} 
		finally {
			System.out.println("Exceptions handled"); 
		} 



	}

}
