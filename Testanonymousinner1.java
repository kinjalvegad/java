interface eatable
{
    void eat();
}
class Testanonymousinner1
{
    public static void main(String argc[])
    {
        eatable e=new eatable()
        {
            public void eat()
            {
                System.out.println("nice fruit");
            }
        };
        e.eat();
    }
}

//nice fruit
