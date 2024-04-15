package threesum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class ThreesumTest {
    @Test
    void testThreeSum() {
        Threesum threesum = new Threesum();

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        List<List<Integer>> result = threesum.threeSum(nums);
        assertEquals(expected.size(), result.size(), "Number of triplets found should match expected");
        assertTrue(expected.containsAll(result) && result.containsAll(expected), "Found triplets should match expected");

        nums = new int[]{0, 0, 0, 0};
        expected = Arrays.asList(Arrays.asList(0, 0, 0));
        result = threesum.threeSum(nums);
        assertEquals(expected.size(), result.size(), "Number of triplets found should match expected");
        assertTrue(expected.containsAll(result) && result.containsAll(expected), "Found triplets should match expected");
    }
    @Test
    void testThreeSumNoTriplets() {
        Threesum threesum = new Threesum();

        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> result = threesum.threeSum(nums);
        assertEquals(expected.size(), result.size(), "Number of triplets found should match expected");
        assertTrue(expected.containsAll(result) && result.containsAll(expected), "Found triplets should match expected");
    }
    @Test
    void testThreeSumEmptyInput() {
        Threesum threesum = new Threesum();

        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> result = threesum.threeSum(nums);
        assertEquals(expected.size(), result.size(), "Number of triplets found should match expected");
        assertTrue(expected.containsAll(result) && result.containsAll(expected), "Found triplets should match expected");
    }
}