import java .util.*;
class simpleif
{
	public static void main (String argc[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("you are eligiable");
		}
		System.out.println("End");
	}
}