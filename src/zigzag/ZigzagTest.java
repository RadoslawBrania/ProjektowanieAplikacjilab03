package zigzag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZigzagTest {
    @Test
    void testConvertExample1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, Zigzag.convert(s, numRows), "Conversion for numRows=3 should match the expected result");
    }

    @Test
    void testConvertExample2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, Zigzag.convert(s, numRows), "Conversion for numRows=4 should match the expected result");
    }

    @Test
    void testConvertEdgeCase() {
        String s = "A";
        int numRows = 1;
        String expected = "A";
        assertEquals(expected, Zigzag.convert(s, numRows), "Conversion for numRows=1 should return the input string unchanged");
    }

    @Test
    void testConvertEmptyString() {
        String s = "";
        int numRows = 3;
        String expected = "";
        assertEquals(expected, Zigzag.convert(s, numRows), "Conversion for an empty string should return an empty string");
    }
    @Test
    void testConvertSingleRow() {
        String s = "HELLO";
        int numRows = 1;
        String expected = "HELLO";
        assertEquals(expected, Zigzag.convert(s, numRows), "Conversion for a single row should return the input string unchanged");
    }
}