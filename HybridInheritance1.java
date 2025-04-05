interface Worker {
    void performDuties();
}

class Person {
    void eat() {
        System.out.println("Person is eating.");
    }
}

class Doctor extends Person implements Worker {
    public void performDuties() {
        System.out.println("Doctor is treating patients.");
    }
}

class Engineer extends Person implements Worker {
    public void performDuties() {
        System.out.println("Engineer is designing a project.");
    }
}

public class HybridInheritance1 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.eat();
        d.performDuties();

        Engineer e = new Engineer();
        e.eat();
        e.performDuties();
    }
}
