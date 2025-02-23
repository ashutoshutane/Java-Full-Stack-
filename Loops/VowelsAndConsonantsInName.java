import java.util.Scanner;
class VowelsAndConsonantsInName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.next().toUpperCase();
		for(int i = 0; i <= name.length()-1 ; i++)
		{
			if(name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U')
			{
				System.out.println(name.charAt(i) + " is a Vowel");
			}
			else
			{
				System.out.println(name.charAt(i) + " is a Consonant");
			}

		}
	}
}
