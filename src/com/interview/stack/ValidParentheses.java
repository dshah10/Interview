package com.interview.stack;

import java.util.Stack;

/**
 * Problem: Given a string containing just the characters '(', ')', '{', '}', 
 *          '[' and ']', determine if the input string is valid.
 *
 *          An input string is valid if:
 *
 *          Open brackets must be closed by the same type of brackets.
 *          Open brackets must be closed in the correct order.
 *          Note that an empty string is also considered valid.
 * 
 * Solution: 
 */
public class ValidParentheses {
    private Stack<Character> myStack = new Stack<>();


    public boolean isValid(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }

        char[] array = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if(array[i] == '(' || array[i] == '{' || array[i] == '[') {
                myStack.push(array[i]);
            } else {
                if(myStack.empty()) {
                    return false;
                }

                char ch = myStack.peek();
                myStack.pop();
                if((array[i] == ')' && ch != '(') || 
                   (array[i] == '}' && ch != '{') ||
                   (array[i] == ']' && ch != '[')) {
                    return false;
                } 
            }
        }

        return myStack.empty();
    }
}