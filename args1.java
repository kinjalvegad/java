public class args1 
{
    static int sum(int...n)
    {
        int sum = 0;
        System.out.println(" ");
        for(int n1 :n)
        {
            System.out.println(n1 + " ");
            sum+=n1;
        }
        return(sum);
    }
    public static void main(String[] args) 
    {
        System.out.println("two args sum="+sum(10,20));
        System.out.println("three args sum="+sum(20,30,40));    
        System.out.println("four args sum="+sum(40,50,60,70));        
    }    
}


/*10
20
two args sum=30

20
30
40
three args sum=90

40
50
60
70
four args sum=220 */