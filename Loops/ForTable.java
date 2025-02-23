import java.util.Scanner;
class ForTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num for getting the table : ");
		System.out.print(" ");
		int num = sc.nextInt();
		System.out.print("Enter the range of the table : ");
		System.out.print(" ");
		int range = sc.nextInt();
		for(int i = 1 ; i <= range ; i++)
		{
			int ans = num * i; 
			System.out.println(num + " X " +i+ " = " +ans);
		}
		
	}
}
