public class TransposeMatrix_InPlace {

    public static void transpose(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++)
            for (int j = i; j < matrix[0].length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,9},
                {11,4,3},
                {2,2,3}
        };

        transpose(matrix);
    }
}
