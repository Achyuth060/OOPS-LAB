class Employee {
    void displayDetails() {
        System.out.println("This is an employee.");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager manages the team.");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes code.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        Developer d = new Developer();

        System.out.println("Manager Details:");
        m.displayDetails();
        m.manageTeam();

        System.out.println("\nDeveloper Details:");
        d.displayDetails();
        d.writeCode();
    }
}
