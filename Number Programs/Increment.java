class Increment 
{
	public static void main(String[] args) 
	{
		int poc = 100;
		System.out.println(++poc); //101
		System.out.println(++poc); //102
		System.out.println(poc++); //102
		System.out.println(++poc); //104
		System.out.println(++poc + poc++); //210
	}
}
