public class AllOccurrences {
    public static void allOcc(int arr[], int i, int target) {
        if (i == arr.length) return;
        if (arr[i] == target) {
            System.out.println(i);
        }
        allOcc(arr, i + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 7, 9, 6};
        allOcc(arr, 0, 6);
    }
}
