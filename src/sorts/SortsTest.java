package sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class SortsTest {
    @Test
    void testBubbleSort() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        Sorts.BubbleSort bubbleSort = new Sorts.BubbleSort();
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr, "Bubble Sort did not sort the array correctly.");
    }

    @Test
    void testQuickSort() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        Sorts.QuickSort quickSort = new Sorts.QuickSort();
        quickSort.sort(arr);
        assertArrayEquals(expected, arr, "Quick Sort did not sort the array correctly.");
    }

    @Test
    void testMergeSort() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        Sorts.MergeSort mergeSort = new Sorts.MergeSort();
        mergeSort.sort(arr);
        assertArrayEquals(expected, arr, "Merge Sort did not sort the array correctly.");
    }

    @Test
    void testInsertionSort() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        Sorts.InsertionSort insertionSort = new Sorts.InsertionSort();
        insertionSort.sort(arr);
        assertArrayEquals(expected, arr, "Insertion Sort did not sort the array correctly.");
    }

    @Test
    void testSelectionSort() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        Sorts.SelectionSort selectionSort = new Sorts.SelectionSort();
        selectionSort.sort(arr);
        assertArrayEquals(expected, arr, "Selection Sort did not sort the array correctly.");
    }

    // Testy wyjątków dla przypadków niepoprawnych danych wejściowych
    @Test
    void testNullArray() {
        Sorts.BubbleSort bubbleSort = new Sorts.BubbleSort();
        assertThrows(NullPointerException.class, () -> bubbleSort.sort(null), "Sorting a null array should throw NullPointerException.");
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        Sorts.QuickSort quickSort = new Sorts.QuickSort();
        quickSort.sort(arr);
        assertEquals(0, arr.length, "Sorting an empty array should result in an empty array.");
    }
    // Testy czasu wykonania
    @Test
    void testBubbleSortPerformance() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Sorts.BubbleSort bubbleSort = new Sorts.BubbleSort();
        long startTime = System.nanoTime();
        bubbleSort.sort(arr);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        assertTrue(duration < 10000000, "Bubble Sort took too long to sort 10000 elements.");
    }
}