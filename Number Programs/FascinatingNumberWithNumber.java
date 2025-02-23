import java.util.Scanner;
class FascinatingNumberWithNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		for(int i = 2 ; i<=3 ; i++)
		{
			num = (num*1000) + (temp*i);
		}
		for(int i = 1 ; i<=9 ; i++)
		{
			int cnt = 0;
			for(int j = num ; j>0 ; j /= 10)
			{
				int rem = j%10;
				if (rem == i)
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				System.out.println(temp + " is a Fascinating Number");
				break;
			}
			else
			{
				System.out.println(temp + " is not a Fascinating Number");
				break;
			}
		}
	}
}
