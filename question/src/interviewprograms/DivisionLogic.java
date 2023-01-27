package interviewprograms;
public class DivisionLogic {
	public static void main(String[] args) {
		int number=568, a=number,i,sum=0;
		int j=number%10;
		if(j>=0) {
			if(j==5) 
				System.out.println( a + "  is divisible by 5 ");
			else if(j==0)
				System.out.println(a + "  is divisible by 5 ");
			else 
				System.out.println(a + "  is not divisible by 5 ");
		}
		while (number>0) {
			i=number%10;		//=567%10=7 ,56%10=6
			sum=sum+i;// 0+7 +6 +5
			number=number/10;  //   56/10=56
		}
		if(sum%3==0) 
			System.out.println(a + "  is divisible by 3 ");
		else 
			System.out.println(a + "  is not  divisible by 3 ");
	}

}
