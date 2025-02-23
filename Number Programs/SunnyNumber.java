import java.util.Scanner;
class SunnyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int Newnum = num + 1;
		boolean flag = false;
		for(int i = 1 ; i<=Newnum ; i++)
		{
			if((i*i)==Newnum)
			{
				flag = true;
				System.out.println(num + " is a Sunny Number");
			}
		}
		if(!flag)
		{
			System.out.println(num + " is not a Sunny Number");
		}

	}
}
