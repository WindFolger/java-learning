import java.util.HashMap;

public class LeetCodeReview {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] nums = {2, 11, 15,7};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
