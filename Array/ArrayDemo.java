import java.util.*;
public class ArrayDemo
{
    public static void main(String x[])
	{
	     Scanner xyz  = new Scanner(System.in);
		 int a[]=new int[5];//array created
		 System.out.println("Enter five values in array");
		 for(int i=0; i<a.length; i++)
		 { a[i]=xyz.nextInt();
		 }
		 System.out.println("Display array values");
		 for(int i=0; i<a.length; i++)
		 { System.out.printf("%d\t",a[i]);
		 }
	}
}
