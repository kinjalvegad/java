class A
{
	A()
	{
		System.out.println("class a");
	}
}

class B extends A
{
	B()
	{
		System.out.println("class b");
	}
}

class consinherit1
{
	public static void main(String args[])
	{
		B b1=new B();
	}
}