package interviewprograms;

public class ThisandSuperChild  extends ThisandSuper{
	int a=100; static int  b=200;
		public void method1(){			
			System.out.println("value of a in child class    :" + this.a);
		//	System.out.println("value of b in child class   :" + this.b);
			System.out.println();
			System.out.println("value of a in parent class   :" + super.a);
		//	System.out.println("value of b in parent class   :" + super.b);
			
			System.out.println("value of a   :" +b);
		}

		public static void main(String[] args) {
			ThisandSuperChild obj = new ThisandSuperChild();
			obj.method1();	

	}

}
