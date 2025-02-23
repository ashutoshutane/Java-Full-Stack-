import java.util.Scanner;
class PoundsToKilogram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in pounds : ");
		float pounds = sc.nextFloat();

		float kg = pounds * 0.454f;
		System.out.println(pounds + " pounds is " + kg + " kilograms");
	}
}
