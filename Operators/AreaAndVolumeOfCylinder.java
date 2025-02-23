import java.util.Scanner;
class AreaAndVolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final float pi = 22/7;
		System.out.print("Enter the radius of Cylinder : ");
		double r = sc.nextDouble();
		System.out.print("Enter the height of Cylinder : ");
		int h = sc.nextInt();
		
		double area = pi *(r*r);
		double volume = area * h;

		System.out.println("Area of cylinder is : " + area);
		System.out.println("Voulume of cylinder is : "+ volume);
	}
}
