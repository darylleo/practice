package com.yuan.onlineprograming;

import java.util.HashMap;

/**
 * 两数之和：给一个数组-nums 和目标值-target 返回 nums数组中符合两束相加等于目标值的下包数组
 *
 * @author wl
 * @create 2022/08/16
 */
public class LC001 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    /**
     * 方法二：双重for
     */
}
