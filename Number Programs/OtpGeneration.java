class OtpGeneration 
{
	public static void main(String[] args) 
	{
		String otp = "";
		for(int cnt = 1 ; cnt <= 10 ;cnt++)
		{
			otp += (int)(Math.random()*1000000);
			if(otp.length()==6)
			{
				System.out.println(otp);
				
			}
			otp = "";
		}
	}
}
