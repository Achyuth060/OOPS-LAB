class Employee {
    String name;
    int id;

    // Constructor 1
    Employee() {
        name = "Unknown";
        id = 0;
    }

    // Constructor 2
    Employee(String n) {
        name = n;
        id = 0;
    }

    // Constructor 3
    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("John");

        class TemperatureConverter {
            // Convert Celsius to Fahrenheit
            double convert(double celsius) {
                return (celsius * 9 / 5) + 32;
            }

            // Convert Celsius and adjust for altitude
            double convert(double celsius, int altitude) {
                return ((celsius * 9 / 5) + 32) - (altitude * 0.003);
            }
        }

        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("Celsius to Fahrenheit: " + converter.convert(25));
        System.out.println("Adjusted for altitude: " + converter.convert(25, 1000));

        Employee e3 = new Employee("Alice", 102);
        e1.display();
        e2.display();
        e3.display();
    }
}
