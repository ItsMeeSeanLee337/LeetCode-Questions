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
    public ListNode detectCycle(ListNode head) 
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
                break;
            }
        }
        //If we have not found a cycle using the tortoise and hare method, we will return null
        if (hare == null || hare.next == null)
        {
            return null;
        }
        //If there is a cycle, we advance the head and the tortoise pointers until they intersect
        while (head != tortoise)
        {
            head = head.next;
            tortoise = tortoise.next;
        }
        //The intersection point of the head and tortoise pointers is where the tail connects to a node
        return head;
    }
}