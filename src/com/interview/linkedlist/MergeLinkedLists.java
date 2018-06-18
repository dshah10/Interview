package com.interview.linkedlist;

/**
 * Problem: Merge two sorted linked lists and return it as a new list. 
 *          The new list should be made by splicing together the nodes of the 
 *          first two lists.
 * 
 * Solution: 
 */

public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class MergeLinkesLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy; 

        while(l1 != null && l2 != null) {
            int v1 = l1.val;
            int v2 = l2.val;
            
            if(v1 <= v2) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }

            l3 = l3.next;
        }

        if(l1 != null) {
            l3.next = l1;
        }

        if(l2 != null) {
            l3.next = l2;
        }

        return dummy.next;
    }
}