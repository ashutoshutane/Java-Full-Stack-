class Pattern18
{
	public static void main(String[] args) 
	{
		int a = 1; 
		char b = 'a';
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int j = 1 ; j<=i ; j++)
			{	
				if(i%2!= 0)
				{
					System.out.print(b++ +" ");
				}
				else
				{
					System.out.print(a++ +" ");
				}
			}
			System.out.println();
		}
	}
}
