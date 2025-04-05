class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        dog.bark();

        System.out.println();

        cat.sound();
        cat.meow();
    }
}
