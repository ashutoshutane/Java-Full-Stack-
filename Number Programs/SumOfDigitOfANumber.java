import java.util.Scanner;
class SumOfDigitOfANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		for(int i = 1 ; num>0 ; i++)
		{
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("Sum of the digits of number "+dup+ " is = " +sum);
	}
}
