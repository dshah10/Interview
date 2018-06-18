package com.interview.array;

/**
 * Problem: Given a sorted array nums, remove the duplicates in-place such 
 *          that each element appear only once and return the new length.
 *          Do not allocate extra space for another array, 
 *          you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Clarification: Confused why the returned value is an integer but your answer is an array?
 *                Note that the input array is passed in by reference, 
 *                which means modification to the input array will be known to the caller as well.
 * 
 * Solution: https://leetcode.com/articles/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int write = -1;
        int read = 0;
        for(; read < nums.length - 1; ) {
            while(read < nums.length - 1 && 
                  nums[read] == nums[read+1]) {
                      read++;
                  }

            if(read < nums.length - 1 && 
               nums[read] != nums[read+1]) {
                nums[++write] = nums[read++];
            }
        }

        nums[++write] = nums[read];

        return write + 1;
    }
}