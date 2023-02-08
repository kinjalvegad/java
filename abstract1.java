abstract class shape
{
	abstract void draw();
}
class line extends shape
{
	void draw()
	{
		System.out.println("line");
	}
}

class rectangle extends shape
{
	void draw()
	{
		System.out.println("rectangle");
	}
}

class abstract1
{
	public static void main(String args[])
	{
		line l1=new line();
		rectangle r1= new rectangle();
		l1.draw();
		r1.draw();
	}
}