package matrix;
import org.junit.jupiter.api.Test;

import static matrix.Matrix.SpiralMatrixTraversal.printSpiralMatrix;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void Test1() throws Matrix.InvalidMatrixException {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals("123698745", printSpiralMatrix(matrix1));
    }
    @Test
    void Test2() throws Matrix.InvalidMatrixException{
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        assertEquals("123481211109567",printSpiralMatrix(matrix2));
    }
}