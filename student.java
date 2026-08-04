public class student {
    String name = "sindhu";
    int age = 19;
    void display(){
        System.out.println("name:" +name);
        System.out.println("age:" +age);
    }
    public static void main(String[] args){
        student s = new student();
        s.display();
    }
    
}
