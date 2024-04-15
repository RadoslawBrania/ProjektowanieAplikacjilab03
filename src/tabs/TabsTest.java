package tabs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TabsTest {
    @Test
    void testFindMedianSortedArrays() {
        Tabs.MedianOfTwoSortedArrays medianFinder = new Tabs.MedianOfTwoSortedArrays();

        int[] nums1 = {1, 3, 5, 7, 9};
        int[] nums2 = {2, 4, 6, 8, 10};
        assertEquals(5.5, medianFinder.findMedianSortedArrays(nums1, nums2), "Median of {1, 3, 5, 7, 9} and {2, 4, 6, 8, 10} should be 5.5");

        nums1 = new int[]{1, 2, 5, 8, 10};
        nums2 = new int[]{3, 4, 6, 7};
        assertEquals(5.0, medianFinder.findMedianSortedArrays(nums1, nums2), "Median of {1, 2, 5, 8, 10} and {3, 4, 6, 7, 9} should be 5.0");

        nums1 = new int[]{1, 2, 3, 4, 5};
        nums2 = new int[]{6, 7, 8, 9, 10};
        assertEquals(5.5, medianFinder.findMedianSortedArrays(nums1, nums2), "Median of {1, 2, 3, 4, 5} and {6, 7, 8, 9, 10} should be 5.5");
    }

    @Test
    void testFindMedianSortedArraysEmptyInput() {
        Tabs.MedianOfTwoSortedArrays medianFinder = new Tabs.MedianOfTwoSortedArrays();

        int[] nums1 = {};
        int[] nums2 = {};
        assertEquals(0.0, medianFinder.findMedianSortedArrays(nums1, nums2), "Median of empty arrays should be 0.0");
    }

}