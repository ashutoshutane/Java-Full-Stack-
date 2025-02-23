import java.util.Scanner;
class FinancialApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill : ");
		float bill = sc.nextInt();
		System.out.println("Enter the gratuity rate : ");
		float gratuity = sc.nextFloat();
		
		float tipamount = (bill * gratuity)/100;
		float totalbill = bill + tipamount;
		System.out.println("totalbill : " +totalbill);
		System.out.println("Tip added is " +tipamount);
		


		
	}
}
