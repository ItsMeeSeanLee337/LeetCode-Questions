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
    public ListNode removeElements(ListNode head, int val) 
    {
        //We create a dummy listnode, setting dummy.next to head. We then set a pointer to dummy.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointer = dummy;
        //While there are still more nodes to check, we see if the node next to the pointer has the given value 
        //if so we set pointer.next to pointer.next.next. Otherwise we iterate normally.
        while (pointer.next != null)
        {
            if (pointer.next.val == val)
            {
                pointer.next = pointer.next.next;
            }
            else
            {
                pointer = pointer.next;
            }
        }
        return dummy.next;
    }
}