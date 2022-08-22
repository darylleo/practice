package com.yuan.onlineprograming;

import java.util.HashSet;

/**
 * 无重复字符的最长字串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
 *
 * @author wl
 * @create 2022/08/18
 */
public class LC003 {

    public static void main(String[] args) {
        //"abcabcbb"  "ckilbkd"
        String s ="ckilbkd";
        System.out.println(lengthOfLongestSubstring(s));
        //System.out.println(lengthOfLongestSubstring2(s));
    }

    /**
     * <p style:color = orange>思路一、</p>
     * <p style:color = green>1、遍历字符串，如果下一个有重复，清空原串，不重复，拼接上去<p>
     * <p style:color = green>2、在清空原串前，找到当前字符在原串中的位置的下一个字符 next，组成新串（next-当前字符的串），继续遍历。<p>
     * @param s 字符串
     * @return 最长不重复长度
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        String longest = "";
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char iChar = s.charAt(i);
            if (longest.indexOf(iChar) != -1) {
                max = Math.max(longest.length(), max);
                longest = longest.substring(longest.indexOf(iChar)+1);
            }
            longest += iChar;
        }
        return Math.max(max,longest.length());
    }




    /**
     * 最长字串 不符合题意的
     * @param s 字符串
     * @return 某个字符的最长串，包头尾
     */
    public static  int lengthOfLongestSubstring2(String s) {
        if (s == null) {
            return 0;
        }
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i <s.length(); i++) {
            if (set.add(s.charAt(i))) {
                int lastIndex = s.lastIndexOf(s.charAt(i));
                if (max < lastIndex - i) {
                    max = lastIndex - i;
                }
            }
        }
        return max+1;
    }
}
