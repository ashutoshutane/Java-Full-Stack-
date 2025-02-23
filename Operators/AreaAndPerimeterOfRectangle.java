import java.util.Scanner;
class AreaAndPerimeterOfRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Width of Rectangle : ");
		double w = sc.nextDouble();
		System.out.print("Enter the Height of Rectangle : ");
		double h = sc.nextDouble();

		double area = w * h;
		double perimeter = (w + h)*2;

		System.out.println("Area of Rectangle is Equal to : " + area);
		System.out.println("Perimeter of Rectangle is Equal to : " + perimeter);
	}
}
