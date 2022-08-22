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

    /**
     * <p style: color = orange>思路一：双重for</p>
     * <p style: color = green>将数组中的每一个值和数组中的另一个值相加</p>
     */
    public static int[] planOne(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * <p style: color = orange>思路二：map遍历</p>
     * <p style: color = green>将数组的值当作k，下标当作v，利用map.containsKey方法判断</p>
     * @param nums
     * @param target
     * @return
     */
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

}
