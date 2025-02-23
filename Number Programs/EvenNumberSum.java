import java.util.Scanner;
class EvenNumberSum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;
			//if(!(rem % 2 == 0)) //for odd numbers sum
			if(rem % 2 == 0)
				sum += rem;
				num = num /10;
		}
		System.out.println("Sum of Even Number of digit "+dup+ " is given as follow :" + sum);
		// System.out.println("Sum of Odd Number of digit "+dup+ " is given as follow :" + sum);

	}
}