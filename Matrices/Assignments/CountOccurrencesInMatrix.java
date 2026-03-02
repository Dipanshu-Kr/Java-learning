public class CountOccurrencesInMatrix {

    public static int findNumber(int[][] matrix, int val) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] == val)
                    count++;

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = { {4,7,8}, {8,8,7} };
        System.out.println(findNumber(matrix, 8));
    }
}
