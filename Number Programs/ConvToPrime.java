import java.util.Scanner;
class ConvToPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = sc.nextInt();
		boolean flag = true;
		int dup = num ;
		for(int i = 2 ; i < num ; i++)
		{
			if(num%i==0)
			{
				flag = false;
				num++;
				i = 2;
			}
		}
		if(num>1)
		{
		System.out.println("next prime after "+dup+ " is = " +num);
		}
	}  
}
