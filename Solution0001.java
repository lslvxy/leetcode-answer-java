import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * 
 * @author lise
 * @since 2020-10-30 22:53:37
 */
class Solution0001 {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        if (nums.length <= 0) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            int s1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (s1 + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 5, 6, 7 }, 9)));
    }
}