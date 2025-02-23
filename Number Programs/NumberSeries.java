import java.util.Scanner;
class NumberSeries
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = 12;
		for(int i=num; i<17 ;i++)
		{
			if(i%2==0)
			{
				System.out.println(num*num);
			}
			else
			{
				System.out.println(num*num*num);
			}
			num++;
		}
	}
}
