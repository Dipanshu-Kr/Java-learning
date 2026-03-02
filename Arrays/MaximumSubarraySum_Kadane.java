public class MaximumSubarraySum_Kadane {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int x : arr) {
            curr += x;
            max = Math.max(max, curr);
            if (curr < 0) curr = 0;
        }

        System.out.println("Max Sum = " + max);
    }
}
