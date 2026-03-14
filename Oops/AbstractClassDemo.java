public class AbstractClassDemo {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {

    String color;

    Animal(){
        color = "brown";
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    void walk(){
        System.out.println("Horse walks on four legs");
    }
}

class Chicken extends Animal{

    void walk(){
        System.out.println("Chicken walks on two legs");
    }
}
