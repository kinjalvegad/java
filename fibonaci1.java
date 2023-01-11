// 1 1 2 3 5 8 .....
import java .util.*;
class fibonaci1
{
	public static void main(String args[])
	{
		int n,i,a=1,b=1,c;
		c=a+b;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		System.out.println(a+" " + b+ " ");
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}
}