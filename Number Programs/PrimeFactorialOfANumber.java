import java.util.Scanner;
class PrimeFactorialOfANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int cnt = 0;

		for(int i = 2 ; i < num ; i++)
		{
			if(num%i==0)
			{
				if(i%2!=0)
				System.out.println(i+" ");
				cnt++;
			}
		}
	}
}
