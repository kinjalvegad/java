import java .util.*;
class elseifladder
{
	public static void main(String args[])
	{
		float avg;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter avg marks");
		avg=sc.nextFloat();
		if(avg>=70)
		{
			System.out.println("dist");
		}
		else if(avg>=60)
		{
			System.out.println("first");
		}
		else if(avg>=50)
		{
			System.out.println("second");
		}
		else if(avg>=40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("try again");
		}
	}
}