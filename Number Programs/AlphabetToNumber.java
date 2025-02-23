import java.util.Scanner;
class AlphabetToNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		String str = sc.next().toUpperCase();
		int op = 0;
		char ch = str.charAt(0);
		if(str.length()>2)
		{
			System.out.println("INVALID STRING");
			return;
		}
		op = (ch-64);
		if(str.length()==2)
		{
			char ch1 = str.charAt(1);
			op = (op*26)+(ch1-64);
		}
		System.out.println(str+" : "+op);
	}
}
