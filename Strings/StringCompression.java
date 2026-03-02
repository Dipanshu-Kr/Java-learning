public class StringCompression {

    public static String compress(String s) {

        if (s.length() == 0) return "";

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1))
                count++;
            else {
                if (count > 1) sb.append(count);
                sb.append(s.charAt(i));
                count = 1;
            }
        }

        if (count > 1) sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabbcccdd"));
    }
}
