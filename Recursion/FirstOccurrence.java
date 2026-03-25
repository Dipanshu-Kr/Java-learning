public class FirstOccurrence {
    public static int firstOcc(int arr[], int i, int target) {
        if (i == arr.length) return -1;
        if (arr[i] == target) return i;
        return firstOcc(arr, i + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 7, 9, 6};
        System.out.println(firstOcc(arr, 0, 6));
    }
}
