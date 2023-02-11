class Ab
{
	protected void dispAb()
	{
		System.out.println("disp Ab");
	}
}

class Bb
{
	public static void main(String args[])
	{
		Ab ab1=new Ab();
		ab1.dispAb();
	}
}
// disp Ab