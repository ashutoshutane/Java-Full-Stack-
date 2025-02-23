class VowelsAndConsonants 
{
	public static void main(String[] args) 
	{
		for(char i = 'a' ; i <= 'z' ; i++)
		{
			if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
			{
				System.out.println(i + " : is a Vowels");
			}
			else
			{
				System.out.println(i + " : is a Consonants");
			}
		}
	}
}
