import java.util.HashMap;

public class TwoSumFinal {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("索引: [" + result[0] + ", " + result[1] + "]");
            System.out.println("数值: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("无解");
        }
    }

    /**
     * 两数之和 - HashMap 一遍循环（最终版）
     * 时间复杂度: O(n)，空间复杂度: O(n)
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 需要找的另一个数

            if (map.containsKey(complement)) {
                // 找到了，返回两个索引
                return new int[]{map.get(complement), i};
            }

            // 把当前数及其索引存入 HashMap
            map.put(nums[i], i);
        }

        return null; // 无解
    }
}