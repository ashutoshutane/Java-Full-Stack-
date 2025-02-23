import java.util.Scanner;
class SumOfDigitsInANumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number between 0 to 1000 : ");
		int num = sc.nextInt();
		
		int dup = num;
		int sum = 0;

		int rem = num % 10;
		sum = sum + rem;
		num = num / 10;

		rem = num % 10;
		sum = sum + rem;
		num = num /10;

		rem = num % 10;
		sum = sum + rem;
		num = num /10;

		System.out.println("The sum of the digit of the number " +dup+ " is " + sum);



	}
}
