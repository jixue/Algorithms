package com.jixue.leetcode.solutions.bitmanipulation;

/**
 * Created by jx on 17/4/4.
 *
 * Description:
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note:0 ≤ x, y < 231.
 *
 <pre>
    Example:

    Input: x = 1, y = 4

    Output: 2

    Explanation:
    1   (0 0 0 1)
    4   (0 1 0 0)
           ↑   ↑
 The above arrows point to positions where the corresponding bits are different.
 </pre>
 */
public class HammingDistance {

    /**
     * 根据题目描述不难发现最后要得出x异或y结果的二进制表示中1的个数,
     * 采用n & (n - 1)
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while(xor != 0){
            count ++;
            xor = xor & (xor - 1);//计算xor二进制形式中1的个数
        }
        return count;
    }
}
