import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sqr = num*num;
		int sum = 0;
		for(int i = sqr ; i>0 ; i/=10)
		{
			int rem = i%10;
			sum += rem;
		}
		if(num==sum)
		{
			System.out.println(num + " is a Neon Number");
		}
		else
		{
			System.out.println(num + " is not a Neon Number");
		}
	}
}
