package com.interview.string;

/**
 * Problem: Implement strStr().
 *          Return the index of the first occurrence of needle in haystack, 
 *          or -1 if needle is not part of haystack.
 * 
 * Clarification: What should we return when needle is an empty string?
 *                For the purpose of this problem, we will return 0 when needle 
 *                is an empty string. 
 * 
 *                This is consistent to C's strstr() and Java's indexOf()               
 * 
 * Solution:
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) {
            return 0;
        }

        if(haystack == null || haystack.length() == 0) {
            return -1;
        }

        int l1 = haystack.length(); 
        int l2 = needle.length();
        if(l1 < l2) {
            return -1;
        }

        int i = 0;
        for(; i <= l1 - l2; i++) {
            int j = 0;
            int k = i;
            if(haystack.charAt(k) == needle.charAt(j)) {
                k++;
                j++;
                while(j < l2 && haystack.charAt(k++) == needle.charAt(j++));

                if(j == l2) {
                    return i; 
                }
            } 
        }

        return -1;
    }
}