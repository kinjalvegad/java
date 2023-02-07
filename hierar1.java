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

class C extends A
{
	void dispC()
	{
		System.out.println("class c");
	}
}

class hierar1
{
	public static void main(String args[])
	{
		B b1;
		
		b1=new B();
		b1.dispA();
		b1.dispB();
	
		 C c1=new C();
		c1.dispA();
		c1.dispC();
	}
}
/*class a
class b
class a
class c*/