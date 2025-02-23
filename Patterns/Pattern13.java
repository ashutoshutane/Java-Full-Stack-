class Pattern13 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i<=5 ; i++)
		{
			char b = 'a';
			for(int j = 1 ; j<=i ; j++)
			{
				System.out.print(b++ +" ");
			}
			System.out.println();
		}
		
	}
}
