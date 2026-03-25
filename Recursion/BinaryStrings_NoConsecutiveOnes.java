public class BinaryStrings_NoConsecutiveOnes {
    public static void generate(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        generate(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            generate(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        generate(3, 0, "");
    }
}
