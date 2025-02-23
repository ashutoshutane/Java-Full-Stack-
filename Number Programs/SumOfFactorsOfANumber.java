import java.util.Scanner;
class SumOfFactorsOfANumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		for(int i = 2 ; i<num ; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				sum += i;
				cnt++;
			}
		}
		System.out.println();
		//System.out.println(cnt);
		System.out.println("Sum of factors of number "+num+" is = "+sum);
	}
}