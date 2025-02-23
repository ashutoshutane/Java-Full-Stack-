import java.util.Scanner;
class CelsiusToFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in celsius : ");
		double celsius = sc.nextDouble();
		double Fahrenheit = (9.0/5) * celsius + 32;
		System.out.println(celsius + " celsius is equal to " + Fahrenheit + " Fahrenheit");
	}
}
