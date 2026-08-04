public class variablesDemo
{
    int instanceVar = 10;
    static String staticVar = "I am static";
    public void showVariables()
    {
        int localVar = 5;
        System.out.println("instance variable:" + instanceVar);
        System.out.println("static variable:" + staticVar);
        System.out.println("local variable:" + localVar);

    }
    public static void main(String[]args)
    {
        variablesDemo obj1=new variablesDemo();
        obj1.showVariables();
        System.out.println("Acessing static variable via class:" + variablesDemo.staticVar);
        
    }
}