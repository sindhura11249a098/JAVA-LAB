import java.util.ArrayList;
import java.util.Scanner;

public class packagesdemo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C++");

        System.out.println("Hello, " + name);
        System.out.println("Subjects: " + subjects);

        sc.close();
    
}
}
