class A
{
    public void display(){
        System.out.println("this is display func");
        return 10;
    }
}
public class Test
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.display();
        System.out.println("hello world one two");
    }
}
