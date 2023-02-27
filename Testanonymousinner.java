abstract class person
{
    abstract void eat();
}
class Testanonymousinner
{
    public static void main(String argc[])
    {
        person p =new person()
        {
            void eat()
            {
                System.out.println("nice fruit");
            }
        };
        p.eat();    
    }   
}

//nice fruit
