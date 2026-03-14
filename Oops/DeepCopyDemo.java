public class DeepCopyDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.marks[0] = 19;
        s1.marks[1] = 17;

        Student s2 = new Student(s1);

        s1.marks[1] = 20;

        System.out.println(s2.marks[1]);
    }
}

class Student {

    int marks[];

    Student() {
        marks = new int[2];
    }

    Student(Student s1) {
        marks = new int[2];

        for(int i = 0; i < marks.length; i++) {
            marks[i] = s1.marks[i];
        }
    }
}
