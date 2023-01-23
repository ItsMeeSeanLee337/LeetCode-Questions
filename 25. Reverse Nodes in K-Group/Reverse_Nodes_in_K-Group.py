# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseKGroup(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        #Check if we need to reverse the group
        curr = head
        for i in range(k):
            #If the "curr" pointer is null, we return the head of the linked list, i.e. we do not proceed with reversing the group
            if not curr:
                return head
            curr = curr.next
        #Reverse the group (using two pointers)
        prev = None
        curr = head
        for _ in range(k):
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        #After reversing, we know that the "head" is the tail of the group
        #With that information, curr will be the next pointer in the original linked list order
        #Thus we will use recursion, to reverse the next set of linked list nodes
        head.next = self.reverseKGroup(curr, k)
        return prev