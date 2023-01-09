import java.util.*;
class switch1
{
	public static void main(String args[])
	{
		int color;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color code");
		color=sc.nextInt();
		switch(color)
		{
			case 2:
			System.out.println("blue");
			break;
			
			case 3:
			System.out.println("yellow");
			break;
			
			case 1:
			System.out.println("red");
			break;
			
			
		}
		
	}
}

