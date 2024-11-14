import java.util.*;
public class GetSum
{
 public static void  main(String x[])
   {  
	int a[]=new int[5];//10 20 30 40 50 
     Scanner xyz  = new Scanner(System.in);
     System.out.println("Enter values in array");
      for(int i=0; i<a.length;i++)
      {
	 a[i]=xyz.nextInt();
      }
      calSum(a);
   System.out.println("display array");
   for(int i=0;i<a.length;i++)
     {  
	System.out.printf("%d\t",a[i]);
     }
     }
	public static void calSum(int m[])
     {      m[1]=100;
   }
}