import java.util.*;
public class ArraySum
{
	public static void main(String []args)
	{ int sum=0;
	Scanner sc=new Scanner(System.in);
	int a[]=new int [5]; // array created
	System.out.println("Enter five value in array");
	for (int i=0; i<a.length; i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.println("Display array values");
	for (int i=0; i<a.length; i++)
	{
	System.out.printf("%d\t ",a[i]);
	sum= sum+a[i];
	}
	System.out.printf("\nSum of all value is &d\n",sum);
	}
}
	