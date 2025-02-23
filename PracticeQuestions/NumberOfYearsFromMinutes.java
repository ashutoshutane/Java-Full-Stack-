import java.util.Scanner;
class NumberOfYearsFromMinutes  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes : ");
		int min = sc.nextInt();

		int days = min / 1440;
		int years = days / 365;

		int totdays = years * 365;			
						
		int remdays = days - totdays;

		System.out.println( min + " minutes is approximmately " + years +" years and " + remdays + " days");
	}
}
