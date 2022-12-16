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
    public ListNode deleteDuplicates(ListNode head) {
        //Check if head or head.next is null, if so return head
        if (head == null || head.next == null)
        {
            return head;
        }
        //Intialize a pointer to the head node
        ListNode pointer = head;
        //Traverse through all the elements looking at the current node and the next node
        while (pointer != null && pointer.next != null)
        //If the value of the current node and next node is the same, we set the next node to the next next node, otherwise just increment the pointer
        {
            if (pointer.val == pointer.next.val)
            {
                pointer.next = pointer.next.next;
            }
            else
            {
                pointer = pointer.next;
            }
        }
        return head;
    }
}