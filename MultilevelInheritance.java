class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    int length = 5;
    int breadth = 3;

    void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Cuboid extends Rectangle {
    int height = 4;

    void volume() {
        int volume = length * breadth * height;
        System.out.println("Volume of Cuboid: " + volume);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Cuboid myCuboid = new Cuboid();
        myCuboid.displayShape();
        myCuboid.area();
        myCuboid.volume();
    }
}

