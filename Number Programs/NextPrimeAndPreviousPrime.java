import java.util.Scanner;
class NextPrimeAndPreviousPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int Nprime = 0;
		int Pprime = 0;

		for(int i = num-1 ; i>=2 ; i--)
		{
			boolean flag = true; //Assuming that number is prime 
			for(int j = 2 ; j < 1 ; j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				Pprime = i;
				break;
			}

		}
		for(int i = num + 1; ;i++)
		{
			boolean flag = true;
			for(int j = 2 ; j < 1 ; j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				Nprime = i;
				break;
			}
		}
		if(num-Pprime<Nprime-num)
		{
			System.out.println(Pprime+" "+num);
		}
		else if(num-Pprime>Nprime-num)
		{
			System.out.println(num+" "+Nprime);
		}
		else
		{
			System.out.println(Pprime+" "+num+" "+Nprime);
		}
	}
}
