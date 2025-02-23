import java.util.Scanner;
class MaxDigitNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		int max = 9;
		for(int i = num ; i > 0 ; i/=10)
		{
			int dgt = i%10;
			if(max<dgt)
			{
				max = dgt;
			}
		}
		System.out.println("Largest dgt from "+num+" is "+max);
	}
}
