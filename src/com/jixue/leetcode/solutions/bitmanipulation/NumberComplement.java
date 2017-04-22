package com.jixue.leetcode.solutions.bitmanipulation;

/**
 *
 * Created by jx on 17/4/22.
 *
 * 476.Number Complement (https://leetcode.com/problems/number-complement/#/description)
 * 数的二进制表示,各个位取反
 */
public class NumberComplement {

    /**
     * 例子:输入5(101),输出2(010)
     * 不难发现,结果即输入值 与 和输入值相同位数的且每位都是1的数 进行异或操作
     * 详细解释见:http://www.jianshu.com/p/718c635895f9
     * @param num
     * @return
     */
    public int findComplement(int num) {
        int temp = num,comp = 1;
        while(temp != 0){
            temp >>= 1;
            comp <<= 1;
        }
        return (comp - 1) ^ num;
    }
}
