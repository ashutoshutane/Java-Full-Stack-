import java.util.Scanner;
class SumOfFactorialOfADigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		while(num > 0)
		{
			int  rem = num % 10;
			int fact = 1;
			for(int i = rem ; i > 0 ; i--)
			{
				fact *= i;
			}
		sum += fact;
		num /= 10;
		}
		System.out.println("Sum of factorial of digit : "+sum);
	}
}
