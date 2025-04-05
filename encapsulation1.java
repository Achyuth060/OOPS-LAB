class Student {
    private int age;

    public void setAge(int a) {
        if (a > 0 && a < 150)
            age = a;
        else
            System.out.println("Invalid age");
    }

    public int getAge() {
        return age;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println("Age: " + s.getAge());
    }
}
