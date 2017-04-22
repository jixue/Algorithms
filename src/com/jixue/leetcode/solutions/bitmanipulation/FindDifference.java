package com.jixue.leetcode.solutions.bitmanipulation;

/**
 * Created by jx on 17/4/22.
 *
 * 389. Find the Difference(https://leetcode.com/problems/find-the-difference/#/description
 */
public class FindDifference {

    /**
     * a^b^a = b
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        char result = 0;
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }
        return result;
    }
}
