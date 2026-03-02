public class SubarraySum_BruteForce {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum += arr[k];

                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
        }

        System.out.println("Max sum = " + max);
        System.out.println("Min sum = " + min);
    }
}
