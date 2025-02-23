import java.util.Scanner;
class ProductOfDigitsInNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num ;
		int product = 1;

		int rem = num % 10;
		product = product * rem;
		num = num/10;

		rem = num % 10;
		product = product * rem ;
		num = num / 10;

		rem = num % 10;
		product = product * rem ;
		num = num / 10;

		rem = num % 10;
		product = product * rem ;
		num = num / 10;

		System.out.println("The product of the digits of number " + dup + " is " + product);

	}
}
