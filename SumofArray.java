class SumofArray
{
	public static void main(String args[])
	{
		int sum=0;
		int a[]={10,20,30,40,50,60};
			
		
		for(int i=0;i<a.length;i++)
			sum=a[i]+sum;
			System.out.println("Sum of Array = "+sum);
	}
}