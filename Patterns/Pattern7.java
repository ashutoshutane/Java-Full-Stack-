class Pattern7
{
	public static void main(String[] args) 
	{
		int num = 5;
		for(int i = 1 ; i<=num ; i++)
		{
			for(int j = 1 ; j<=num ; j++)
			{
				if((i+j)>=6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	} 
}
