import java.util.Scanner;
class FactorialOfOddDigitNumber
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num ;
		int sum = 0;
		while(num>0)
		{
			int rem = num % 10;
			if(rem%2!=0)
			{
				int fact = 1;
				for(int i = rem ; i > 0 ; i--)
				{
					fact *= i;
				}
				sum += fact;
				
			}
			num /= 10;
		}
		System.out.println(dup);
		System.out.println("Sum of factorials of odd digits of a number is given as : "+ sum);
	}
}