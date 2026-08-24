import java.util.HashMap;

/**
 * TwoSumFinal - 两数之和（最终版）
 * 
 * 本程序演示 HashMap 在算法题中的经典应用。
 * 
 * 算法思路：
 * 1. 遍历数组，对于每个元素 nums[i]
 * 2. 计算 complement = target - nums[i]
 * 3. 检查 complement 是否在 HashMap 中
 *    - 如果在，返回 [complement 的索引, i]
 *    - 如果不在，将 nums[i] 和 i 存入 HashMap
 * 
 * 为什么用 HashMap？
 * - HashMap 的查询时间复杂度为 O(1)
 * - 将整体时间复杂度从 O(n²) 优化到 O(n)
 * 
 * 这是 LeetCode 第 1 题的标准解法。
 */
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
     * 
     * @param nums 输入数组
     * @param target 目标和
     * @return 两个数的索引数组，若无解返回 null
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // 需要找的另一个数
            int complement = target - nums[i];

            // 检查是否已在 map 中
            if (map.containsKey(complement)) {
                // 找到了，返回两个索引
                return new int[]{map.get(complement), i};
            }

            // 把当前数及其索引存入 HashMap，供后续元素查找
            map.put(nums[i], i);
        }

        return null; // 无解
    }
}
