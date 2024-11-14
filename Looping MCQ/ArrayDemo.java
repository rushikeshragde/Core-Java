import java.util.*;
public class ArrayDemo{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int  a[]=new int[5]; // array created
	System.out.println("Enter five value in array");
	for (int i=0; i<a.length; i++) 
	{
	a[i]=sc.nextInt();
	System.out.println("Display array values");
	for (int i=0; i<a.length; i++)
	{System.out.println("%d/t",a[i]);
	}
	}
}