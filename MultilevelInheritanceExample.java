class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals feed mik to their babies.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // from Animal
        myDog.walk();  // from Mammal
        myDog.bark();  // from Dog
    }
}
