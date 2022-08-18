package com.yuan.onlineprograming;

/**
 * 生成每种字符串都是奇数个的字符串
 * 给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。
 *
 * 返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。
 * @author wl
 * @create 2022/08/16
 */
public class LC1374 {

    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        String s = "a";

        if (n % 2 == 1) {
            return sb.append(repeat(s,n)).toString();
        }
        return sb.append(repeat(s,n - 1)).append("b").toString();
    }

    private String repeat(String s ,int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(s);
        }
        return result.toString();
    }
}
