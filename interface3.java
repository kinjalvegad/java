interface A
{
	void dispA();
}
interface B extends A
{
	void dispB();
}
class C implements B
{
	public void dispA()
	{
		System.out.println("interaface a");
	}
	
	public void dispB()
	{
		System.out.println("interaface b");
	}
	void dispC()
	{
		System.out.println("class c");
	}
}
class interface3
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.dispA();
		c1.dispB();
		c1.dispC();
	}
}
/* interaface a
/* interaface b
class c*/