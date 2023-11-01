class InitializersUse
{
	int a,b;
	static int c;
	
	void display()
	{
		System.out.println("we r in display method");
		System.out.println(a + b + c);
	}
	InitializersUse()
	{
		System.out.println("we r in constructor");
	}

	{
		System.out.println("we r in instance block");
		a=10;
		b=20;
		c=100;
	}
	
} 