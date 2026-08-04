class Animal {
    final void display(){
        System.out.println("this is a final method");
    }
 
}
class Dog extends Animal{
}
public class FinalMethod{
    public static void main(String[] args){
        Dog d=new Dog();
        d.display();
    }
}
