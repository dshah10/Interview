package com.interview.number;

/**
 * @author Deepal shah
 * 
 * Problem: Given a 32-bit signed integer, reverse digits of an integer.
 *          https://leetcode.com/problems/reverse-integer/description/
 * 
 * Solution: https://leetcode.com/articles/reverse-integer/
 */

 public class ReserveInteger {

    public int reverse(int x) {
        boolean isNeg = false;
        
        if(x < 0) {
            isNeg = true;
            x = x * (-1);
        }
        
        /**
         * 1. If reversed = reversed * 10 + pop causes overflow, then it must
         *    be reversed >= (Integer.MAX_VAUE/10)
         * 2. If reversed > (Integer.MAX_VAUE/10); then 
         *    reversed = reversed * 10 + pop is gauranteed to overflow
         * 3. If reversed == (Integer.MAX_VAUE/10); then
         *    reversed = reversed * 10 + pop will overflow iff pop > 7
         */
        long reversed = 0; 
        while(x != 0) {
            reversed = reversed * 10 + (x%10);
            x = x / 10;
            
            // rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)
            // rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }

        if(isNeg) {
            reversed = reversed * (-1);
        }

        return (int)reversed;   
    }
}