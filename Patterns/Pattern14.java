class Pattern14 
{
	public static void main(String[] args) 
	{
		char b = 'a';
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int j = 1 ; j<=i ; j++)
			{
				System.out.print(b++ +" ");
			}
			System.out.println();
		}
		
	}
}
