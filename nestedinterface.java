interface showable
{
    void show();
    interface message
    {
        void msg();
    }
}
class nestedinterface implements showable.message
{
    public  void msg()
    {
        System.out.println("hello nested interface");
    }
    public static void main(String argc[])
    {
        showable.message message = new nestedinterface();
        message.msg();
    }
}

// hello nested interface