import java.util.*;
class ArrParent
{
	int a[];
	void setArray(int a[])
	{
	this.a=a;
	}
class Sort extends ArrParent
{
	int []getSortedArray()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
			 i(a[i]>a[j]);
			 {
				 int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			 }
			}
		}
		return a;
	}
}
class Max extends ArrParent
{
	int getMax()
	{
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max =a[i];
			}
		}
		return max;
	}
}
class Min extends ArrParent
{
	int getMin()
	{
		int min=a[0];
		for(int i=0; i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
}
public class ArrayOperation
{
	public static void main(String a[])
	{
		int a[]=new int[5];
		Sort s=new Sort();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		s.setArray(a);
		int [] res=s.getSortedArry();
		
		for(int i:res)
		{
			System.out.print(i);
		}
		Max m=new Max();
		m.setArray(a);
		int result =m.getMax();
		
		System.out.println("\n the max is "+result);
		
		Min ma=new Min();
		ma.setArray(a);
		result=ma.getMin();
		System.out.println("The minimun value is "+result);
	}
}
}
