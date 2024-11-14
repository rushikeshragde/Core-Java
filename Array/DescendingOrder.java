import java.util.*;
public class DescendingOrder
{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5]; int temp;
	System.out.print("Enter value in array");
	for (int i=0; i<a.length; i++)
	{
		a[i]=sc.nextInt();	
	}
	for (int i=0;i<a.length; i++)
	{
		for (int j=i+1; i<a.length; i++)
		{
		if(a[i]<a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	     }
	}
	for(int i=0; i<a.length; i++)
		{
		System.out.print(a[i]+" ");
		}
	}
}