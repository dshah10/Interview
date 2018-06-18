package com.interview.string;

/**
 * Problem: Write a function to find the longest common prefix string amongst 
 *          an array of strings.
 *          
 *          If there is no common prefix, return an empty string "". 
 * Solution: https://leetcode.com/articles/longest-common-prefix/
 *           1) Horizontal scanning
 *           2) Vertical scanning
 *           3) Trie
 *           4) Divide and conqure 
 */
public class LongestCommonPrefix {
    private int getSmallestStringLength(String[] strs) {
        if(strs.length < 1 || strs == null) {
            return 0;   
        }
        
        int length = strs[0].length();
        
        for(int j = 1; j < strs.length; j++) {
            if(strs[j].length() < length) {
                length = strs[j].length();
            }
        }

        return length;
    }

    public String longestCommonPrefix(String[] strs) {
        
        int length = getSmallestStringLength(strs);
        if(length < 1) {
            return "";
        }
        
        int i = 0;
        for(i = 0; i < length; i++) {
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i); 
                }
            }
        }

        return strs[0].substring(0, i);
    }
}