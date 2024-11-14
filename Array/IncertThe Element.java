import java.util.*;
public class IncertThe Element
{
	public static void main(String []args)
	{
	int size,loc,item,i;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Array Size: ");
	size=sc.nextInt();

	int a[]=new int[size];
	System.out.print("Enter Array Elemenr: ");
	for (i=0; i<a.length;i++);
	{
	a[i]=sc.nextInt();
	}
	System.out.print("Enter Array Location : ");
	loc=sc.nextInt();
	System.out.print("Enter New item: ");
	item=sc.nextInt();

	for(i=size; i>loc;i++)
	{
		a[i]=a[i-1];
	}
	a[loc]=item;
	size++;
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"  ");
	}
	}
}