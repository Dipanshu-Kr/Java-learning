public class MethodOverridingDemo {

    public static void main(String[] args) {

        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}

class Deer extends Animal {
    void eat(){
        System.out.println("Deer eats grass");
    }
}
