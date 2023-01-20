/**
 * Constraints:
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 * 
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
    public ListNode deleteDuplicates(ListNode head) 
    {
        //Solution using two pointers
        //Pointer pre will track which nodes have no duplicates
        //Pointer currenct will track how many duplicates of a listNode there are and remove them
        ListNode pre = null;
        ListNode current = head;
        //While the current node is not null and the next node is not null, we check for duplicates
        while (current != null && current.next != null)
        {
            //If the current value is not equal to the next node's value, we set pre to current and current to the next node
            if (current.val != current.next.val)
            {
                pre = current;
                current = current.next;
            }
            //In the case that we have found a duplicate:
            else
            {
                //While the next node is not null and the current node's value is the same as the next node's value, set the current node to the next node
                while (current.next != null && current.val == current.next.val)
                {
                    current = current.next;
                }
                //If the pre node is not null (meaning we have not reached the end of the linked list), we set the pre node to the next node after all duplicates have been removed
                if (pre != null)
                {
                    pre.next = current.next;
                }
                //Otherwise, we will set the head node to the next node
                else
                {
                    head = current.next;
                }
                //Set the current node to the next node to continue down the linked list
                current = current.next;
            }
        }
        return head;
    }
}