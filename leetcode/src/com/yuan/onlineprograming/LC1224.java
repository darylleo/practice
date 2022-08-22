package com.yuan.onlineprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 最大相等概率
 * 给你一个正整数数组 nums，请你帮忙从该数组中找出能满足下面要求的 最长 前缀，并返回该前缀的长度
 * 从前缀中 恰好删除一个 元素后，剩下每个数字的出现次数都相同。
 * 如果删除这个元素后没有剩余元素存在，仍可认为每个数字都具有相同的出现次数（也就是 0 次）
 * 输入：nums = [2,2,1,1,5,3,3,5]
 * 输出：7
 * 解释：对于长度为 7 的子数组 [2,2,1,1,5,3,3]，如果我们从中删去 nums[4] = 5，就可以得到 [2,2,1,1,3,3]，里面每个数字都出现了两次。
 *
 * @author wl
 * @create 2022/08/18
 */
public class LC1224 {
    public static void main(String[] args) {
        //[2,2,1,1,5,3,3,5]
        //{10,2,8,9,3,8,1,5,2,3,7,6}    8
        int[] nums = {10, 2, 8, 9, 3, 8, 1, 5, 2, 3, 7, 6};
        System.out.println(result(nums));
//        int a = 10;
//        int b = 2;
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.println(a);
//        System.out.println(b);
    }

    public static int result(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                System.out.println(count);
            }
        }

        return  0;
    }

    public static int errorAnswer(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

        }
        ArrayList<Integer> list = new ArrayList<>();

        map.forEach((k, v) -> {
            list.add(v);
        });
        list.sort(Integer::compareTo);
        System.out.println(list);
        Integer max = list.get(list.size() - 1);
        Integer min = list.get(0);
        if (max == min) {
            return nums.length - 1;
        }
        int maxResult = 0;
        for (int i = min; i <= max; i++) {
            int count = 0;
            for (Integer value : list) {
                if (i <= value) {
                    count++;
                }
            }
            maxResult = Math.max(maxResult, i * count + 1);
        }
        return Math.min(maxResult, nums.length);
    }

    private static int getRest(int min, int max, List<Integer> list) {
        int maxResult = 0;
        for (int i = min; i <= max; i++) {
            int count = 0;
            for (Integer value : list) {
                if (i <= value) {
                    count++;
                }
            }
            maxResult = Math.max(maxResult, i * count + 1);
        }
        return maxResult;
    }
}
