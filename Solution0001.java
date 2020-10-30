import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * 
 * @author lise
 * @since 2020-10-30 22:53:37
 */
class Solution0001 {
    /**
     * 枚举
     * 
     * @param nums
     * @param target
     * @return
     */
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

    /**
     * 哈希表
     * 
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        int result[] = new int[2];
        if (nums.length <= 0) {
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }
            map.put(target - nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 5, 6, 7 }, 8)));
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 5, 8, 9 }, 7)));
        System.out.println(Arrays.toString(twoSum2(new int[] { 2, 5, 6, 7 }, 9)));
        System.out.println(Arrays.toString(twoSum2(new int[] { 2, 3, 5, 8 }, 5)));
    }
}