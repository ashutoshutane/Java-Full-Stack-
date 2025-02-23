import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month : ");
		String Month = sc.next().toUpperCase();

		String op = (Month.equals("OCT") || Month.equals("NOV") ||Month.equals("DEC")||Month.equals("JAN"))?(Month + " is WINTER"):((Month.equals("FEB")||Month.equals("MAR")||Month.equals("APR")||Month.equals("MAY"))?(Month + " is SUMMER"):((Month.equals("JUN")||Month.equals("JUL")||Month.equals("AUG")||Month.equals("SEP"))?(Month + " is MONSOON"):("INVALID INPUT")));
		System.out.println(op);
	}
}
