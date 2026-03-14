public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.sum(5,4));
        System.out.println(c.sum(5.5f,4.5f));
        System.out.println(c.sum(5,4,1));
    }
}

class Calculator {

    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
