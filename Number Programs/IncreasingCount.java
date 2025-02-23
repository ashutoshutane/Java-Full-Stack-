import java.util.Scanner;
class IncreasingCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = true;
		int n = 10;
		for(int i = num ; i>0 ; i/=10)
		{
			int rem = i % 10;
			if(rem>n)
			{
				flag = false;
				break;
			}
			n = rem;
		}
		System.out.println(flag?num + " is Increasing number" : num + " is not a Increasing number");
	}
}
