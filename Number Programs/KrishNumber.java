import java.util.Scanner;
class KrishNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int dup = num;
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int j = rem ; j>0 ;j--)
			{
			fact *= j;
			}
			sum += fact;
			num /= 10; 
		}
		System.out.println(sum == dup?("The number "+dup+" is a Krishnamurthy number"):("The number "+dup+" is not a Krishnamurthy number"));
	}
	
}
