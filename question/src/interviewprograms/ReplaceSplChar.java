package interviewprograms;

public class ReplaceSplChar {
	public static void main(String[] args) {
		String input ="ABCD!@#$1234";
		StringBuilder  output1=new StringBuilder(input);
		System.out.println(output1);
		output1.replace(4, 8, "5678");		
		System.out.println(output1); 
	}
}
