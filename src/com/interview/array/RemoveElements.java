package com.interview.array;

/**
 * Problem: Given an array nums and a value val, 
 *          remove all instances of that value in-place and return the new length.
 *           
 *          Do not allocate extra space for another array, you must do this by 
 *          modifying the input array in-place with O(1) extra memory.
 * 
 * Solution: https://leetcode.com/articles/remove-element/
 */
public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int write = -1;
        for(int read = 0; read < nums.length; read++) {
            if(nums[read] != val) {
                nums[++write] = nums[read];
            }
        }

        return write + 1;
    }
}