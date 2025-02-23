import java.util.Scanner;
class DigitOfNumberEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		int dup = num;
		int Evensum = 0;
		int Oddsum = 0;
		int temp = 0;

		int rem = num % 10;
		temp = ((rem % 2 == 0)?(Evensum=Evensum+rem):(Oddsum=Oddsum+rem));
		num = num / 10;

		rem = num % 10;
		temp = ((rem % 2 == 0)?(Evensum=Evensum+rem):(Oddsum=Oddsum+rem));
		num = num /10;

		rem = num % 10;
		temp = ((rem % 2 == 0)?(Evensum=Evensum+rem):(Oddsum=Oddsum+rem));
		num = num /10;

		rem = num % 10;
		temp = ((rem % 2 == 0)?(Evensum=Evensum+rem):(Oddsum=Oddsum+rem));
		num = num /10;

		System.out.println("Evensum : " + Evensum);
		System.out.println("Oddsum : " + Oddsum);
	}
}
