class FindVowels
{
	public static void main(String args[])
	{
		String s=" Virat Kohli";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
		if(c=='A' || c=='a' || c=='E' || c=='e' ||c=='I' || c=='i' ||c=='O' || c=='o' ||c=='U' || c=='u')
		    count++;
		  	
		
		}
		System.out.print("count Total vowels = "+count);
		
	}


	
}
