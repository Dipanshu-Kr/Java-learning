public class HybridInheritanceDemo {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bark();
    }
}

class Animal{

    void eat(){
        System.out.println("Animal eats");
    }
}

interface Walkable{
    void walk();
}

class Mammal extends Animal implements Walkable{

    public void walk(){
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal{

    void bark(){
        System.out.println("Dog barks");
    }
}
