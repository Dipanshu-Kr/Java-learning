public class ParameterizedConstructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Dipanshu");
        Student s2 = new Student(851);

        System.out.println(s1.name);
        System.out.println(s2.roll);
    }
}

class Student {
    String name;
    int roll;

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
