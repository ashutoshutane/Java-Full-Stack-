class Census 
{
	public static void main(String[] args) 
	{
		long currpop = 312032486;
		final long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long imm = seconds/45;
		long newpop = currpop + birth - death + imm;
		System.out.println("Current population is equals to : " + currpop);
		System.out.println("New population after 5 yrs is equals to : " + newpop);
		
	}
}
