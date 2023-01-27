package interviewprograms;

public class ProtectedDemoChild extends ProtectedDemoParent{
	public static void main(String[] args) {
		ProtectedDemoChild  obj=new ProtectedDemoChild();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
