package com.aboback.leetcode.string;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 * <p>
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 *
 * @author jhb
 * @date 2020/12/18
 */
public class Demo1 {

    public static void main(String[] args) {

        final char result = findTheDifference("abcd", "abcde");
        System.out.println("result = " + result);
    }

    public static char findTheDifference(String s, String t) {

        int sValue = 0;
        int tValue = 0;
        for (int i = 0; i < s.length(); i++) {
            sValue += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            tValue += t.charAt(i);
        }
        return (char) (tValue - sValue);

    }

    public static char findTheDifference2(String s, String t) {

        for (char c : t.toCharArray()) {
            if (!s.contains(String.valueOf(c))) {
                return c;
            }
        }
        return 'x';

    }

}
