public class FullHollowNum
{
	public static void main(String x[])
	{	boolean flag=true;
		for(int i=1;i<=5;i++)
		{
			int a=1;
			for(int j=1;j<=9;j++)
			{ 	
				if(j>=6-i  && j<=4+i &&flag)
				{
					if(i==5 ||j==6-i )
					{
						System.out.print(a++);
					}
					else if(j==4+i)
					{
						System.out.print(i);
					}
					else{
						System.out.print(" ");
					}
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}