import java.util.*;
class KeithNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int len = 0;
		int sum = 0;
		boolean flag = true;
		
		//loop to get the length of the number
		for(int i = num ; i > 0 ; i/=10)
			len++;

		//we use the len as a size of an array
		int [] arr = new int[len];

		//loop to store the init digits from a number
		for(int i = len-1 ; i>=0 ; i--)
		{
			int rem = num%10;//fetched the last digit
			arr[i] = rem;//stored inside array Using index
			num /= 10;// update the number
		}

		//infinite loop which will iterate
		for (; ; )
		{
			//loop find the sum of digit
			for(int i = 0 ; i<len ; i++)
				sum+=arr[i];

			//Swapping of Elements
			for(int i = 1 ; i<len ; i++)
				arr[i-1]=arr[i];

			arr[len-1] = sum;

			if(dup==sum){
				break;
			}
			if(sum>dup)
			{
				flag = false;
				break;
			}
			sum = 0;
		}
		if(flag)
		{
			System.out.println(dup + " is a KEITH Number");
		}
		else
		{
			System.out.println(dup + " is not Keith Number");
		}
	}
}
