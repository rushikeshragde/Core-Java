public class AscendingArray
{	
	public static void main(String []args)
	{
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Element  array");
	for(int i=0; i<5; i++)
	{
	a[i]=sc.nextInt();
	}
	for(int i=0; i<5; i++)
	{			
	for(int j=i=1; j<5; i++)
		{
		if(a[i]>a[j]);
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}

		}
	}
	for(int i=0; i<5; i++)
	{	
	System.out.print(a[i]+ " ");
	}
	}
}