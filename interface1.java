interface A
{
	void disp();
}
class B implements A
{
	public void disp()
	{
		System.out.println("inteface a");
	}
	void dispB()
	{
		System.out.println("interface b");
	}
}
class interface1
{
	public static void main(String args[])
	{
		A a1;
		a1= new B();
		a1.disp();
		
		B b1=new B();
		b1.disp();
		b1.dispB();
	}
}
/* interface a
/* interface a
/* interface b