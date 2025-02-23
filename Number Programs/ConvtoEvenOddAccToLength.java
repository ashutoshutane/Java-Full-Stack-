import java.util.Scanner;
class ConvtoEvenOddAccToLength
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int cnt = 0;
		int dup = num;
		String newNum =" ";
		for(int i = num ; i > 0 ; i/=10)
		{
			cnt++;
		}
		if(cnt%2==0)
		{
			for(int j = dup ; num > 0 ; j/=10)
			{
				int rem = j % 10;
				if(rem%2!=0)
				{
					newNum = ++rem + newNum ;
				}
				else
				{
					newNum = rem+ newNum;
				}
			}
		}
		else if(cnt%2!=0)
		{
			for(int j = dup ; num > 0 ; j/=10)
			{
				int rem = j % 10;
				if(rem%2==0)
				{
					newNum = ++rem + newNum ;
				}
				else
				{
					newNum = rem+ newNum;
				}
			}
		}
		System.out.println(newNum);
	}
}
