public class LshapNupattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{  int a=1;
			for(int j=1;j<=9;j++)
			{
				if(j<=2*i-1)
				{
					System.out.print(a);
					if(j<i)
					{
					++a;
					}
					else
					{
					--a;
					}
					
				}
			}
			System.out.println();
		}
	}
}
