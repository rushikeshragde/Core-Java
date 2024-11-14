class A
{
	void main()
	{
	System.out.println("I am A method");
	}
}
class B extends A
{
	void show()
	{
	System.out.println("I am B method");
	}
}
public class MethodOverridingApp
{
	public static void main(String x[])
	{
		B b1 =new  B();
		b1.show();
	}
}