package matrix;

public class Matrix {
    public static class InvalidMatrixException extends Exception {
        public InvalidMatrixException(String message) {
            super(message);
        }
    }

    public static class SpiralMatrixTraversal {
        public static String printSpiralMatrix(int[][] matrix) throws InvalidMatrixException {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                throw new InvalidMatrixException("Matrix is empty");
            }

            int rows = matrix.length;
            int cols = matrix[0].length;

            int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
            StringBuilder retstr= new StringBuilder();
            while (top <= bottom && left <= right) {
                // Print top row
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                    retstr.append(matrix[top][i]);
                }
                top++;

                // Print right column
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                    retstr.append(matrix[i][right]);
                }
                right--;

                // Print bottom row (if applicable)
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(matrix[bottom][i] + " ");
                        retstr.append(matrix[bottom][i]);

                    }
                    bottom--;
                }

                // Print left column (if applicable)
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(matrix[i][left] + " ");
                        retstr.append(matrix[i][left]);
                    }
                    left++;
                }
            }
            return retstr.toString();
        }
    }
}