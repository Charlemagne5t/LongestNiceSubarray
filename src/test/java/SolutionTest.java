import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {1, 3, 8, 48, 10};
        int expected = 3;
        int actual = new Solution().longestNiceSubarray(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] nums = {3, 1, 5, 11, 13};
        int expected = 1;
        int actual = new Solution().longestNiceSubarray(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] nums = {744437702, 379056602, 145555074, 392756761, 560864007, 934981918, 113312475, 1090, 16384, 33, 217313281, 117883195, 978927664};
        int expected = 3;
        int actual = new Solution().longestNiceSubarray(nums);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test4() {
        int[] nums = {135745088, 609245787, 16, 2048, 2097152};
        int expected = 3;
        int actual = new Solution().longestNiceSubarray(nums);

        Assert.assertEquals(expected, actual);
    }

}
