import java.util.Scanner;
class PrimeNumberBetweenARange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num  ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i<=num ; i++)
		{
			boolean flag = true;
			if(i<=1)
			{
				flag = false;
				continue;
			}
			for(int j = 2 ; j<i ; j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
	}
}
