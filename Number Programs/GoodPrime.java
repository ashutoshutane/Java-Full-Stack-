import java.util.Scanner;
class GoodPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num  ");
		int num = sc.nextInt();
		int count = 0;
		
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
				int temp = i;
				flag = true;
				label:
					while(temp>0)
				{
					int rem = temp % 10;
					if(rem == 1)
					{
						flag = false;
						break label;
					}
					for(int j = 2 ; j < rem ; j++)
					{
						if(rem%j==0)
						{
							flag = false;
							break label;
						}
					}
					temp /= 10;
				}
				if(flag)
				{
					System.out.println(i + " ");
					count++;
				}
			}
			
		}
	}
}
