package hackerRankQueries;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number and its index
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // First pass: store all numbers with their indices
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Second pass: check for complement
        for (int i = 0; i < nums.length; i++) {
            int desired = target - nums[i];
            if (map.containsKey(desired) && map.get(desired) != i) {
                return new int[]{i, map.get(desired)};
            }
        }

        // If no solution found
        return new int[]{-1, -1};
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {11,2,15,7};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
