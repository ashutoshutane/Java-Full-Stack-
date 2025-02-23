import java.util.Scanner;
class BinaryNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		String binary = "";
		for(int i = num ; i>0 ; i /= 2)
		{
			binary = (i%2) + binary;
		}
		System.out.println(num + " : " + binary);
	}
}
