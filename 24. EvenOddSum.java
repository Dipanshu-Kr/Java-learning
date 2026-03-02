import java.util.*;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= total; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0)
                evenSum += n;
            else
                oddSum += n;
        }

        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
