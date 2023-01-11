// prime or not
import java.util.*;
class prime1
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				break;
		}
		if(n==i)
			System.out.println( n+"is prime");
		else
		System.out.println(n+"is not prime");
	}
}
/* enter n 
9
9 is not prime
enter n
5
5is prime