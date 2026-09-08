class Employee {

    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {

    void manage() {
        System.out.println("Manager manages the team");
    }
}

class Developer extends Employee {

    void develop() {
        System.out.println("Developer develops software");
    }
}

public class hierarchialinheritance {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.work();
        m.manage();

        Developer d = new Developer();

        d.work();
        d.develop();
    }
}