import java.util.Scanner;
class ProductOfDigitInANumberLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int prod = 1;
		for(int i = 1 ; num>0 ; i++)
		{
			int rem = num % 10;
			prod *= rem;
			num /= 10;
		}
		System.out.println("Product of the digits of number "+dup+ " is = " +prod);
	}
}
