import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {


    @Test
    void cocktailSort() {
        int[] myArray = {5, 7, 3, 2, 1};
        int[] myArray2 = {1, 2, 3, 5, 7};
        Sort.cocktailSort(myArray);
        assertArrayEquals(myArray2, myArray);
    }

    @Test
    void testLength() {
        int[] myArray = {5, 7, 3, 2, 1};
        int oldLength = myArray.length;
        Sort.cocktailSort(myArray);
        assertEquals(oldLength, myArray.length);
    }

    @Test
    void test2() {
        int[] myArray = {1};
        Sort.cocktailSort(myArray);
        assertArrayEquals(new int[] {1}, myArray);
    }
}