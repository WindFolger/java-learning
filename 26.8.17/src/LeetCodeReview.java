import java.util.HashMap;

/**
 * LeetCodeReview - 两数之和（LeetCode 第 1 题）
 * 
 * 题目：给定一个整数数组 nums 和一个目标值 target，
 *      找出数组中和为目标值的两个数的索引。
 * 
 * 解题思路（HashMap 法）：
 * - 遍历数组，对于每个元素 nums[i]，计算 needed = target - nums[i]
 * - 检查 needed 是否已在 HashMap 中
 *   - 如果在，说明找到了答案，返回两个索引
 *   - 如果不在，将当前数 nums[i] 及其索引 i 存入 HashMap
 * 
 * 时间复杂度：O(n) — 只需遍历一次数组
 * 空间复杂度：O(n) — HashMap 存储 n 个元素
 * 
 * 这是最优解法，比暴力枚举（O(n²)）效率高得多。
 */
public class LeetCodeReview {
    
    /**
     * 两数之和核心算法
     * 
     * @param nums 输入数组
     * @param target 目标和
     * @return 两个数的索引数组，若无解返回空数组
     */
    public static int[] twoSum(int[] nums, int target) {
        // HashMap 存储 <数值, 索引>，用于快速查找
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // 计算需要找的另一个数
            int needed = target - nums[i];
            
            // 检查 needed 是否已存在于 map 中
            if (map.containsKey(needed)) {
                // 找到答案，返回两个索引
                return new int[]{map.get(needed), i};
            }
            
            // 将当前数及其索引存入 map，供后续元素查找
            map.put(nums[i], i);
        }
        
        // 无解，返回空数组
        return new int[0];
    }
    
    public static void main(String[] args) {
        // 测试数据
        int[] nums = {2, 11, 15, 7};
        int target = 9;
        
        // 调用算法
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
        // 输出：0 3（nums[0]=2 和 nums[3]=7 相加等于 9）
    }
}
