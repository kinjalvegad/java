// prime all 
import java.util.*;
class primeAll
{
	public static void main(String args[])
	{
		int n1,n2,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		n1= sc.nextInt();
		System.out.println("Enter n2");
		n2= sc.nextInt();
		for(i=n1;i<=n2;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.println(i+"");
		}
	}
}
/* enter n1
1
enter n2
50
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47*/