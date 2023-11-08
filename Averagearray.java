class Averagearray
{
	public static void main(String args[])
    {
		int a[]={10,10,10,10,10,10};
		 int sum=0;
		 int avg=0;
		 
		for(int i=0;i<a.length;i++)
			sum=a[i]+sum;
			System.out.println("array Addition "+ sum);
		
		System.out.println();
		
		avg=sum/6 ;
		System.out.println("Avg od array"+ avg);
		
	}	
}