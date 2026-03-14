public class SingleInheritanceDemo {
    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.eat();
        shark.swim();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}
