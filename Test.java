class A
{
    public void display(){
        System.out.println("this is display func");
    }
}
public class Test
{
    static void display()
    {
        System.out.println("display");
    }
    public static void main(String[] args)
    {
        int a;
        int b;
        A obj=new A();
        obj.display();
        display();
        System.out.println("hello world one two");
    }
}
