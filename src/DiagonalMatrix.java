public class DiagonalMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                    sum += i;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }


        System.out.println("The 10x10 matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


        System.out.println("Sum of the diagonal elements: " + sum);
    }
}
