class NumberPattern1 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=5 ; i++)
		{
			for(int j = i ,a=i,b=4 ; j>=1 ; j-- , a = a+b , b--)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
