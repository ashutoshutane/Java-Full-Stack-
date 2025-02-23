import java.util.Scanner;
class StonePaperScissor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rNum = 0; //store a random num et 1 to 3
		for (; ; )
		{
			//math.random() gen double value from 0.00 some
			// we multi the same value by 10
			// and then to get an integer we used type casting
			int num = (int)(Math.random()*10);
			if ( num>=1 && num<=3) // checked if the digit is bet  1 to 3
			{
				rNum = num ; // then only store
				break ; //if digit found bet 1 to 3 then terminate the loop
			}

		}
		// whatever random value is gen we need to map it with the opt
		String codeOpt = null;
		if(rNum == 1)
		{
			codeOpt = "STONE";
		}
		else if(rNum == 2)
		{
			codeOpt = "PAPER";
		}
		else if(rNum == 3)
		{
			codeOpt = "SCISSOR";
		}

		System.out.println();
		System.out.println("   welcome ");
		System.out.println();
		System.out.println("1.STONE  2.PAPER  3.SCISSOR");
		System.out.print("Enter option : "); // ask the user to enter an opt
		int opt = sc.nextInt();
		String userOpt = null;
		if(opt == 1)
		{
			userOpt = "STONE";
		}
		else if(opt == 2)
		{
			userOpt = "PAPER";
		}
		else if(opt == 3)
		{
			userOpt = "SCISSOR";
		}
		else 
		{
			System.out.println("INVALID INPUT");
			return ; // if invalid opt terminate the exe
		}

		System.out.println("User : "+ userOpt);
		System.out.println(" Bot : "+codeOpt);
		if((opt==1 && rNum==2)||(opt==2 && rNum ==1)||(opt==3&&rNum==2))
		{
			System.out.println("User Wins");
		}
		else if((opt==1 && rNum==2)||(opt==2 && rNum ==3)||(opt==3&&rNum==1))
		{
			System.out.println("Bot Wins");
		}
		else
		{
			System.out.println("Draw");	
		}


	}
}
