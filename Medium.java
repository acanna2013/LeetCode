/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l4 = l3;
        int curr = 0;
        
        // populate the sum linkedlist
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                curr = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if (l1 == null) {
                curr = l2.val;
                l2 = l2.next;
            }
            else if (l2 == null) {
                curr = l1.val;
                l1 = l1.next;
            }
            l3.next = new ListNode(curr);
            l3 = l3.next;
        }
    
        // change double digits to single digits; fix formatting
        ListNode l5 = l4.next;
        while (l4 != null) {
            if (l4.val > 9 && l4.next != null) {
                l4.next.val++;
                l4.val = l4.val % 10;
            }
            else if (l4.val > 9 && l4.next == null) {
                l4.val = l4.val % 10;
                l4.next = new ListNode(1);
            }
            l4 = l4.next;
        }
        return l5;
    }
}
