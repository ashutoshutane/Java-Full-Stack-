import java.util.Scanner;
class LeetCode1ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		int rev = 0;
		for(int i = 0 ; num > 0 ; i++)
		{
			int rem = num % 10;
			rev = rev*10 + rem;
			num /= 10;
		}
		System.out.println(rev);

	}
}
