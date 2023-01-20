/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        //To see if the two linked lists we are given intersect, we will concatenate the two lists in opposite orders
        //i.e. "A + B" and "B + A"
        //If there is an intersection, the two pointers will point to the same ListNode
        //First we will check if we are given null heads, if so we return null:
        if (headA == null || headB == null)
        {
            return null;
        }
        //If we are not given null heads, we will concatenate the two linked lists until we find an intersection or there is no intersection
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        while (ptrA != ptrB)
        {
            //If we have reached the end of headA, begin concatenating with headB
            ptrA = ptrA == null ? headB : ptrA.next;
            //If we have reached the end of headB, begin concatenating with headA
            ptrB = ptrB == null ? headA : ptrB.next;
        }
        //return ptrA since that is the listNode where there is an intersection
    //If there is no intersection, ptrA will be null
        return ptrA;
    }
}