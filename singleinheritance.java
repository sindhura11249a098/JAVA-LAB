class person{
    void walk(){
        System.out.println("person walk");
    }
}
class stu extends person{
    void study(){
        System.out.println("student studies");
    }
}
public class singleinheritance{
    public static void main(String[] args){
        stu s=new stu();
        s.walk();
        s.study();
        

    }

    }
    
    

