package Tests;
import matrix.Matrix;
import sorts.*;
import java.util.Random;
import zigzag.*;
import tabs.*;
import threesum.*;

import static matrix.Matrix.SpiralMatrixTraversal.printSpiralMatrix;

public class Tests {
    public static void Test(int[] arr){

        // Test Bubble Sort

        System.out.println("Bubble: ");
        Sorts.SortingContext bubbleContext = new Sorts.SortingContext(new Sorts.BubbleSort());
        bubbleContext.executeStrategy(arr.clone());

        System.out.println("Quick: ");
        // Test Quick Sort
        Sorts.SortingContext quickContext = new Sorts.SortingContext(new Sorts.QuickSort());
        quickContext.executeStrategy(arr.clone());

        // Test Merge Sort
        System.out.println("Merge: ");
        Sorts.SortingContext mergeContext = new Sorts.SortingContext(new Sorts.MergeSort());
        mergeContext.executeStrategy(arr.clone());

        // Test Insertion Sort
        System.out.println("Insertion: ");
        Sorts.SortingContext insertionContext = new Sorts.SortingContext(new Sorts.InsertionSort());
        insertionContext.executeStrategy(arr.clone());

        // Test Selection Sort

        System.out.println("Selection: ");
        Sorts.SortingContext selectionContext = new Sorts.SortingContext(new Sorts.SelectionSort());
        selectionContext.executeStrategy(arr.clone());
    }
    public static void Test2(){
        System.out.println(Zigzag.convert("PAYPALISHIRING",3));
        System.out.println(Zigzag.convert("PAYPALISHIRING",4));
    }
    public static void Test3(){
        Tabs.MedianOfTwoSortedArrays solution = new Tabs.MedianOfTwoSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Example 1: " + solution.findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Example 2: " + solution.findMedianSortedArrays(nums3, nums4));
    }
    public static void Test4(){

        Threesum solution = new Threesum();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Example 1: " + solution.threeSum(nums1));

        int[] nums2 = {0, 1, 1};
        System.out.println("Example 2: " + solution.threeSum(nums2));

        int[] nums3 = {0, 0, 0};
        System.out.println("Example 3: " + solution.threeSum(nums3));
    }
    public static void Test5(){
            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            try {
                System.out.println("Spiral Matrix Traversal 1:");
                printSpiralMatrix(matrix1);
            } catch (matrix.Matrix.InvalidMatrixException e) {
                System.out.println("Error: " + e.getMessage());
            }

            int[][] matrix2 = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
            };
            try {
                System.out.println("\nSpiral Matrix Traversal 2:");
                printSpiralMatrix(matrix2);
            } catch (Matrix.InvalidMatrixException e) {
                System.out.println("Error: " + e.getMessage());
            }

            int[][] matrix3 = {};
            try {
                System.out.println("\nSpiral Matrix Traversal 3:");
                printSpiralMatrix(matrix3);
            } catch (Matrix.InvalidMatrixException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }

    public static void RunTests(){
        System.out.println("Pesimistic: ");
        Tests.TestPesimistic();
        System.out.println("Optimistic: ");
        Tests.TestOptimistic();
        System.out.println("Random: ");
        Tests.TestRandom();
        Tests.Test2();
        Tests.Test3();
        Tests.Test4();
        Tests.Test5();
    }
    public static void TestRandom() {
        int[] arr = new int[10000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt();
        Tests.Test(arr);
    }
    public static void TestOptimistic(){
        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) arr[i] = i;
        Tests.Test(arr);
    }
    public static void TestPesimistic(){
        int[] arr = new int[10000];

        for (int i = arr.length-1; i > 0; i--) arr[i] = i;
        Tests.Test(arr);
    }
}
