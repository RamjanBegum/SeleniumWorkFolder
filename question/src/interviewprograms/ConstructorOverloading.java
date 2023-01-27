package interviewprograms;
public class ConstructorOverloading {	
	 public ConstructorOverloading(int a,int b){
		int c=a+b;
		System.out.println("sum of 2 integer number is " + c);
	}
	public ConstructorOverloading(double a,double b){
		double c=a+b;
		System.out.println("sum of 2 real number is " + c);
	}
	 
	public  ConstructorOverloading() {
		System.out.println("default constructor");
	}
	public static void main(String[] args) {
		ConstructorOverloading obj1=new ConstructorOverloading(3,6);
		ConstructorOverloading obj2=new ConstructorOverloading(2.5f,7.5f);
		ConstructorOverloading obj3=new ConstructorOverloading();	
	}

}
