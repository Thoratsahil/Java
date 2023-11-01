class RevStringWords	
{
	public static void main(String args[])
	{
		String s="virat kohli is Goat";
		String s1[]=s.split(" ");
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()!=0)
			//System.out.println(s1[i]);
		         for(int j=s1[i].length()-1;j>=0;j--)
					 sb.append(s1[i].charAt(j));
				     sb.append(" ");
					 
					 
		}
		System.out.println(sb);
		
	}
}