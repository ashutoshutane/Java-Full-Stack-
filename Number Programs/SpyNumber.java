import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		int prd = 1;

		for(int i = num ; i>0 ; i /= 10)
		{
			int rem = i % 10;
			sum += rem;
			prd *= rem;
		}
		//System.out.println("sum = " +sum);
		//System.out.println("product = " +prd);
		if(sum == prd)
		{
			System.out.println(num +" is a spy Number");
		}
		else
		{
			System.out.println(num +" is not a spy Number");	
		}
	}
}
