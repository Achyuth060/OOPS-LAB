class Employee {
    private String name;
    private int salary;

    public void setDetails(String n, int s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setDetails("Arjun", 50000);
        System.out.println(e.getName() + " earns ₹" + e.getSalary());
    }
}
