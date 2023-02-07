class A
{
	void dispA()
	{
		System.out.println("class a");
	}
}

class B extends A
{
	void dispB()
	{
		System.out.println("class b");
	}
}

class C extends B
{
	void dispC()
	{
		System.out.println("class c");
	}
}

class multilevel1
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.dispA();
		c1.dispB();
		c1.dispC();
	}
}

/* class a
/* class b
/* class c