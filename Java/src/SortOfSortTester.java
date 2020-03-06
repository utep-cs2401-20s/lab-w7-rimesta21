import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {
    /* Here I am testing the basic functionality of the method by giving the method five positive values with no duplicates
    and an odd number of elements. I used this test case to make sure the method works fine with a "normal" set of
    numbers. The method passed.
     */
    @Test
    public void sortOfSortTest1() {
        SortOfSorted test = new SortOfSorted();
        int[] testArr = {5, 6, 1, 2, 4};
        int[] expected = {4, 2, 1, 5, 6};
        test.sortOfSorted(testArr);

        for(int i = 0; i < testArr.length; i++){
            assertEquals(expected[i],testArr[i]);
        }
    }

    /* Here I tested the method with zero and positive and negative numbers to test whether it would place the
    positives and negatives correctly. The method passed.
     */
    @Test
    public void sortOfSortTest2() {
        SortOfSorted test = new SortOfSorted();
        int[] testArr = {-5, 6, 1, 2, -4, 0};
        int[] expected = {1, 0, -5, -4, 2, 6};
        test.sortOfSorted(testArr);

        for(int i = 0; i < testArr.length; i++){
            assertEquals(expected[i],testArr[i]);
        }
    }

    /* Here I tested the method with duplicates and one two digit numbers. I tested this because I wanted to see if the
    method would put the duplicates "next" to each other and to see if the method can handle numbers with multiple digits.
    The method passed.
     */
    @Test
    public void sortOfSortTest3() {
        SortOfSorted test = new SortOfSorted();
        int[] testArr = {1, 1, 4, 21, 4, 2, 6,};
        int[] expected = {4, 4, 1, 1, 2, 6, 21};
        test.sortOfSorted(testArr);

        for(int i = 0; i < testArr.length; i++){
            assertEquals(expected[i],testArr[i]);
        }
    }

    /* Here I tested the method with multiple duplicates, multiple negatives, and more than one digits that are negative
     and positive numbers. This test pushed the method to it's limits by testing all cases that are common errors. I used
     this test case to have assurance that the method would work even in the most extreme cases. The method passed.
 */
    @Test
    public void sortOfSortTest4() {
        SortOfSorted test = new SortOfSorted();
        int[] testArr = {-1,2, 2, 2, -3, 200, 37, 5, -1, 9, 22, 10, -37, -200, 5, 9 ,-9};
        int[] expected = {22, 10, 5, 5, 2, -1, -9, -37, -200, -3, -1, 2 ,2 , 9 , 9, 37, 200};
        test.sortOfSorted(testArr);

        for(int i = 0; i < testArr.length; i++){
            assertEquals(expected[i],testArr[i]);
        }
    }

    /* Here I tested the method with an array with only one element. This test insures that the method has nothing to
    sort and just returns the original array. The method passed.
*/
    @Test
    public void sortOfSortTest5() {
        SortOfSorted test = new SortOfSorted();
        int[] testArr = {-1};
        int[] expected = {-1};
        test.sortOfSorted(testArr);

        assertEquals(expected[0],testArr[0]);
    }

}
