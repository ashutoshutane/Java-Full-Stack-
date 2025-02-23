import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("    LOAN CALCULATOR ");
		System.out.println();
		System.out.print("Enter the Amount : ");
		float amount = sc.nextFloat();
		System.out.print("Enter the ROI : ");
		float roi = sc.nextFloat();
		System.out.print("Enter thr tenure (months) : ");
		int month = sc.nextInt();
		// con from months to years
		String str = (month/12)+"."+(month%12);
		float con = Float.parseFloat(str);

		System.out.println();
		System.out.println("LOAN CALCULATION ");
		System.out.println("Principal Amount : "+amount);
		System.out.println("ROI : "+roi+ "%");
		System.out.println("Tenure : "+ month + "months");

		float intYear = amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : "+ totalInter);
		float outStanding = amount+totalInter;
		System.out.println("Total Outstanding Amount : "+(outStanding));
		System.out.println("Emi : "+ (outStanding/month)+"rs");
	}
}
