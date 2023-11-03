class Overloading 
{
	 
		 void shot(int a,int b)
		 {
			 System.out.println("we r in parametarized method "+ a * b);
		 }
		 
		 void shot()
		 {
			 System.out.println("we r in  non parameterized method");
		 }
		 
		 void shot(double s,double v,double e)
		 {
			 System.out.println("we r in  3 parametarized method & Method Auto promotion ");
			 System.out.println(s+v+e);
		 }
	 
	 
}