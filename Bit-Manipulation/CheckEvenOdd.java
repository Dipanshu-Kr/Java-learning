public class CheckEvenOdd {

    public static void checkEvenOdd(int num){

        if((num & 1) == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }

    }

    public static void main(String[] args) {

        int num = 10;

        checkEvenOdd(num);

    }
}
