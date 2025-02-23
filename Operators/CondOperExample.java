import java.util.Scanner;
class CondOperExample 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int a = sc.nextInt();
		System.out.print("Enter num2 : ");
		int b = sc.nextInt();
		System.out.print("Enter num3 : ");
		int c = sc.nextInt();
		int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		int small = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println(lar);
		System.out.println(small);
	}
}
