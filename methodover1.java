class A
{
	void disp()
	{
		System.out.println("class a");
	}
}

class B extends A
{
	void disp()
	{
		System.out.println("class b");
	}
}

class methodover1
{
	public static void main(String args[])
	{
		A a1;
		B b1;
		
		a1=new A();
		a1.disp();
		
		a1=new B();
		a1.disp();
		
		b1=new B();
		b1.disp();
	}
}