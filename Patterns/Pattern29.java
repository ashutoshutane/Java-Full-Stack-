class Pattern29
{
    public static void main(String[] args) 
	{
        int num = 5;  // Number of rows
		for (int i = num; i > 0; i--) 
		{
            for (int j = 1; j < i; j++) 
			{
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) 
			{
                if (j == i || j == num || i == 1) 
				{ 
                    System.out.print("* ");
                } 
				else 
				{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
