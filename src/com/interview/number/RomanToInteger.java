package com.interview.number;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given a roman numeral, convert it to an integer. 
 *          Input is guaranteed to be within the range from 1 to 3999.
 *          
 *          Roman numerals are represented by seven different symbols: 
 *          I -> 1, 
 *          V -> 5,
 *          X -> 10, 
 *          L -> 50, 
 *          C -> 100, 
 *          D -> 500 and 
 *          M -> 1000
 *  
 * Solution: 
 */
public class RomanToInteger {
    private int getValue(char ch) {
        switch(ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public int romanToInteger(String s) {
        int result = 0;

        char[] chArr = s.toCharArray();

        int currValue = 0;
        int lastValue = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            lastValue = currValue;
            currValue = getValue(chArr[i]);
            
            if(lastValue > currValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
        }

        return result;
    }
}