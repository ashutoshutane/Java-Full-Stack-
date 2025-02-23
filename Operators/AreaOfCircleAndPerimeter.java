import java.util.Scanner;
class  AreaOfCircleAndPerimeter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final double pi = 22/7;
		int r;
		System.out.print("Enter the Radius of Circle : ");
		r = sc.nextInt();
		double radius = pi *(r * r);
		double perimeter = 2 * pi * r;
		System.out.println("Area of circle having radius " + r + " is equal to : " + radius +" cm^2");
		System.out.println("Perimeter of circle having radius " + r + " is equal to : " + perimeter + " cm^2");

	}
}
