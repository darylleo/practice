package com.yuan.onlineprograming;

import javax.jnlp.IntegrationService;
import java.util.ArrayList;
import java.util.List;

/**
 * 串联所有单词的字串
 *
 * @author wl
 * @create 2022/08/16
 */
public class LC030 {

    public static void main(String[] args) {
        String[] words = {"foo", "bar"};
        List<Integer> result = findSubstring("barfoothefoobarman", words);
        System.out.println(result);
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        if (words == null || words.length == 0) {
            return result;
        }
        if (s.length() < String.join("", words).length()) {
            return result;
        }
        for (String word : words) {
            if (s.contains(word)){
                result.add(s.indexOf(word));
            }else {
                return new ArrayList<>();
            }
        }
        return result;
    }
}
