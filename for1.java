import java.util.*;
class for1
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		//1to 10
		for(i=1;i<=n;i++)
		{
			System.out.println(i +" ");
		}
		// 1to 10
		for(i=1;i<=n;++i)
		{
			System.out.println(i+ " ");
		}
		// direct 11
		for(i=1;i<=n;i++);
		{
			System.out.println(i+ " ");
		}
	}
}