package com.interview.number;

/**
 * @author Deepal shah
 * 
 * Problem: Determine whether an integer is a palindrome. 
 *          An integer is a palindrome when it reads the same backward as forward.
 * 
 *          https://leetcode.com/problems/palindrome-number/description/
 * 
 *  Solution: https://leetcode.com/articles/palindrome-number/
 * 
 * 
 *          Coud you solve it without converting the integer to a string?
 *          
 *          We divided the input by 10 for every iteration, so the time complexity is O(log10n)
 */

 public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Given -121 as input; reversed value becomes 121-; so all negative
        // numbers are not palindrome numbers. 
        // Given 100 as input; reversed value becomes 001; so all multiples of 
        // 10 are also not palindrome numbers. 
        if(x < 0 || (x !=0 && x%10 == 0)) {
            return false;
        }
        
        int reversed = 0;

        while(x > reversed) {
            reversed = reversed * 10 + (x%10);
            x = x / 10;
        }

        return (x == reversed) || ( x == reversed/10 );
    }
}