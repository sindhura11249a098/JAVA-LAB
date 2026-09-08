class university{
    void provideedu(){
        System.out.println("univ provides education");
    }
}
class department extends university{
    void conductclasses(){
        System.out.println("department conducts classes");
    }
}
class professor extends department{
    void teach(){
        System.out.println("professor teaches students");
    }
}
public class multilevel{
    public static void main(String[] args){
        professor p=new professor();
        p.provideedu();
        p.conductclasses();
        p.teach();
    }
}
    

