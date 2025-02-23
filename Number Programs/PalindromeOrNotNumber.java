import java.util.Scanner;
class PalindromeOrNotNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		int dup = num;
		int rev = 0;

		for(int i = 0 ; num > 0 ; i++)
		{
			int rem = num % 10;
			rev = rev*10 + rem;
			num /= 10;
		}
		if(rev == dup)
		{
			System.out.println("The number "+dup+" is a palindrome number ");
		}
		else
		{
			System.out.println("The number "+dup+" is not a palindrome number ");
		}
	}
}
