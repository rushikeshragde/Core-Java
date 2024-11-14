import java.util.*; 
public class ElementReverseOrder
{
	public static void main(String []args)
	{
	int a[]=new int [5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter element i array ");
	for (int i=0; i<a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Array Element ");
	for (int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println("Array Revers Element ");
	for(int i=a.length-1; i>=0; i--)
	{
	System.out.print(a[i]+" ");
	}
	}
}