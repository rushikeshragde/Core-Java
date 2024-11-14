class A
{
	int no=1000;
	void show()
	{
	System.out.println("I am A method");
	}
}
class B extends A
{
	void show()
	{
	System.out.println("I am B method "+super.no);
	super.show(); // we call it on second line
	}
}
public class superTest2
{
	public static void main(String x[])
	{
	B b1 = new B();
	b1.show();
	}
} 