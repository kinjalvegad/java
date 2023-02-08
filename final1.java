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

 final class C extends A
{
	void disp()
	{
		System.out.println("class c");
	}
}

class final1
{
	public static void main(String args[])
	{
		B b1=new B();
		
		b1.disp();
	
		 C c1=new C();
		c1.disp();
	}
}
/* class b
class c */
