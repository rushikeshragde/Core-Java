public class HundredSecond
{
	public static void main(String []args)
	{
	int a[]=new int []{10,20,30,40,50};
	int b[];
	b=a;
	b[1]=100;

System.out.println("Display array values");
for (int i=0; i<a.length; i++)
	{
	System.out.printf("%d\n",a[i]);
	}
	}	
}