import java.util.Scanner;
class FindingAPrimeNewLogic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int den = 2;
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		while(den<num)
		{
			if(num%den==0)
			{
				break;
			}9
			den++;
		}
		if(num==den)
		{
			System.out.println("The number "+num+" is a prime number");
		}
		else
		{
			System.out.println("The number "+num+" is not a prime number");
		}
	}
}
