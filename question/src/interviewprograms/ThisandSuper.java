package interviewprograms;

public class ThisandSuper {
	int a = 10;
	static int b = 20; static int c = 30;
	private int d=78;
	
	public void method1() {
		this.a = 40;
	//	this.b= 50;
	//	this.c=60;
		this.d=90;
		System.out.println("value of a   :" + a);
		System.out.println("value of b   :" + b);
		System.out.println(d);
	}

	public static void main(String[] args) {
		ThisandSuper obj = new ThisandSuper();
		obj.method1();
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
