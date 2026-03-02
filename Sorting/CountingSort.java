public class CountingSort {

    public static void sort(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int x : arr)
            largest = Math.max(largest, x);

        int[] count = new int[largest + 1];

        for (int x : arr)
            count[x]++;

        int j = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};

        sort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
