class RectSideDaigonal
{
	public static void main(String x[])
	{
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==1||j==7||i==1||i==7||i==j||j==8-i)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}			
	}
}