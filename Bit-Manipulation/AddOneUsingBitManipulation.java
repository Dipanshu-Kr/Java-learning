public class AddOneUsingBitManipulation {

    public static int addOne(int n) {
        return - (~n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(addOne(n));
    }
}
