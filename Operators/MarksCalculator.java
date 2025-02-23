import java.util.Scanner;
class  MarksCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks : ");
		float marks = sc.nextInt();

		float percentage = (marks/600f)*100f;

		String op = (percentage>=75)?("Grade A with " +percentage+ "%"):((percentage>=60)?("Grade B with " +percentage+ "%"):((percentage>=35)?("Grade C with " +percentage+ "%"):("Fail")));
		System.out.println(op);
	}
}
