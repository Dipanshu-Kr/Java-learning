import java.util.*;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        int n = 12;

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }
}
