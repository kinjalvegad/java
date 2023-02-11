interface A
{
	void dispA();
}

interface B
{
	void dispB();
}

class C
{
	void dispC()
	{
		System.out.println("class c");
	}
}

class D extends C implements A,B
{
	public void dispA()
	{
		System.out.println("interface a");
	}
	
	public void dispB()
	{
		System.out.println("interface a");
	}
	void dispD()
	{
		System.out.println("class d");
	}
}

class interface4
{
	public static void main(String args[])
	{
		D d1=new D();
		d1.dispA();
		d1.dispB();
		d1.dispC();
		d1.dispD();
	}
}

/* interface a
interface a
class c
class d*/