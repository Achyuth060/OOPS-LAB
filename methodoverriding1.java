class Person {
    void greet() {
        System.out.println("Hello! I am a person.");
    }
}

class Student extends Person {
    void greet() {
        System.out.println("Hello! I am a student studying hard.");
    }
}

public class MethodOverridingUnique1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.greet();

        Student s = new Student();
        s.greet();
    }
}
