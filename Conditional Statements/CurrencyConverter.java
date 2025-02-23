import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("   CURRENCY CONVERTER  ");
		System.out.println();
		Syshe amount(INR) : ");tem.out.print("Enter t
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println(" LIST OF CURRENCY ");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. AED");
		System.out.println("6. IQD");
		System.out.println();
		System.out.println("Enter the Cuurency ");
		String opt = sc.next().toUpperCase();
		float Concurre = 0;

		if(opt.equals("USD"))
		{
			Concurre = inr/86.56f;
			System.out.println(inr + " INR = "+ Concurre+" USD");
		}
		else if(opt.equals("EUR"))
		{
			Concurre = inr/90.25f;
			System.out.println(inr + " INR = "+ Concurre+" EUR");
		}
		else if(opt.equals("GBP"))
		{
			Concurre = inr/107.65f;
			System.out.println(inr + " INR = "+ Concurre+" GBP");
		}
		else if(opt.equals("PKR"))
		{
			Concurre = inr/0.3099f;
			System.out.println(inr + " INR = "+ Concurre+" PKR");
		}
		else if(opt.equals("AED"))
		{
			Concurre = inr/23.56f;
			System.out.println(inr + " INR = "+ Concurre+" AED");
		}
		else if(opt.equals("IQD"))
		{
			Concurre = inr/0.06f;
			System.out.println(inr + " INR = "+ Concurre+" IQD");		
		}
		else
		{
			System.out.println("INVALID OPTION");	
		}
	}
}
