/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        //For this problem we will use Floyd's tortoise and hare algorithm
        //The tortoise pointer will traverse in increments of 1
        //The hare pointer will traverse in increments of 2
        //If there is a cycle in the linked list, eventually the tortoise and the hare will interesect
        ListNode tortoise = head;
        ListNode hare = head;
        while (hare != null && hare.next != null)
        {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare)
            {
                return true;
            }
        }
        return false;
    }
}