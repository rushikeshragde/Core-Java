pubilc class HollowGapPryamid
{
	 public static void main(String x[])
	 {int i,j;
		for(i=1;i<=6;i++)
		{
			boolean flag=true;
			for(j=1;j<=11;j++)
			{	
				if(j>=7-i &&j<=5+i &&flag)
				{
					if(i==6||j==7-i||j==5+i)
					{
					  System.out.print("*");
					}	
					else
					{
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