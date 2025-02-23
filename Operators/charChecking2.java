import java.util.Scanner;
class charChecking2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the char : ");
		char a = sc.next().charAt(0); 
		String op = ((a>='A' && a<='Z')||(a>='a'&&a<=122)?((a>='a'&&a<='z')?(a + " is s Lowercase Alphabet"):(a + " is an UpperCase Alphabet")):((a>='0'&&a<='9')?(a + " is a Digit"):(a + " is a Special Character")));
		System.out.println(op);
	}
}
