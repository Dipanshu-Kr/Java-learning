public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.run();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal extends Animal {
    void run() {
        System.out.println("Mammal runs");
    }
}

class Dog extends Mammal {
}
