import java.util.Scanner;
class charChecking 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the char : ");
		char a = sc.next().charAt(0); 
		System.out.println((a>=65 && a<=90)?("char is UpperCase"):("Char is not a uppercase"));
	}
}
