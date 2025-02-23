class Decrement 
{
	public static void main(String[] args) 
	{
		int poc = 100;
		System.out.println(--poc); //99
		System.out.println(--poc); //98
		System.out.println(poc--); //98
		System.out.println(--poc); //96
		System.out.println(--poc - poc--); //0
	}
}
