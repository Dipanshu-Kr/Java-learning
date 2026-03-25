public class NumberToString {
    public static String convert(int n, String s) {
        if (n == 0) return s;
        int rem = n % 10;

        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        s = words[rem] + " " + s;

        return convert(n / 10, s);
    }

    public static void main(String[] args) {
        System.out.println(convert(2026, ""));
    }
}
