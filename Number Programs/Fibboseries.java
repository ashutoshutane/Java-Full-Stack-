import java.util.Scanner;
class Fibboseries
{
	public static void main(String[]args)
	{
		int First_term = 0 , Second_term = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Series : ");
		n = sc.nextInt();
		
		System.out.println("The Fibbonaci series upto " +n+ " number is given as follows : ");
		for(int i = 0 ; i<=n ; i++)
		{
			System.out.print(First_term  + " ");
			int Next_term = First_term + Second_term;
			First_term = Second_term;
			Second_term = Next_term;
		}

	}
}