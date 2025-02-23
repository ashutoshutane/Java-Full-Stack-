import java.util.Scanner;
class SumOfEvenAndOddDigitOfANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int Odd = 0;
		int Even = 0;
		for(int i = 1 ; num>0 ; i++)
		{
			int rem = num % 10;
			if(rem%2!=0)
			{
				Odd += rem;
			}
			else if(rem%2==0)
			{
				Even += rem;
			}
			else
			{
				System.out.println("Invalid Input");		
			}
			num /= 10;
		}
		System.out.println("Sum of the Odd digits of numbers "+dup+ " is = " +Odd);
		System.out.println("Sum of the Even digits of numbers "+dup+ " is = " +Even);

	}
}
