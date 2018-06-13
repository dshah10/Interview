package com.interview.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Deepal Shah
 *
 *	Problem: Given an array of integers, return indices of the two numbers such 
 *           that they add up to a specific target.
 *       	 https://leetcode.com/problems/two-sum/description/
 *           
 *           Given nums = [2, 7, 11, 15], target = 9,
 *           Because nums[0] + nums[1] = 2 + 7 = 9,
 *           return [0, 1].
 */

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                result[0] = map.get(complement); 
                result[1] = i;
                return result;
                //return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        
        throw new IllegalArgumentException();
    }
}