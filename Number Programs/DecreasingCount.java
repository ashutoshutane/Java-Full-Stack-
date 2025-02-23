import java.util.Scanner;
class DecreasingCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = true;
		int n = 0;
		for(int i = num ; i>0 ; i/=10)
		{
			int rem = i % 10;
			if(n>rem)
			{
				flag = false;
				break;
			}
			n = rem;
		}
		System.out.println(flag?num + " is Decreasing number" : num + " is not a Decreasing number");
	}
}
