import java.util.Scanner;	
class EmirpNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int rev = 0;
		for(int i = num ; i>0 ; i/=10)
		{
			int rem = i%10;
			rev = rev * 10 + rem;
		}
		boolean flag1 = true;
		for(int i = 2 ; i < num ; i++)
		{
			if(num%i!=0)
			{
				flag1 = false;
				System.out.println(dup +" is a prime");
				break;
			}
			else if(flag1)
			{
				System.out.println(dup +" is not a prime");
				break;
			}	
		}
		boolean flag2 = true;
		for(int j = 2 ; j < rev ; j++)
		{
			if(num%j!=0)
			{
				flag2 = false;
				System.out.println(rev + " is a prime");
				break;
			}
			else if(flag2)
			{
				System.out.println(rev +" is not a prime");
				break;
			}
		}
		if(flag1 == false && flag2 == false)
		{
			System.out.println("The number "+dup+" and "+rev+" is a Emirp Number");
		}
		else
		{
			System.out.println("The number "+dup+" and "+rev+" is not a Emirp Number");
		}
	}
}
