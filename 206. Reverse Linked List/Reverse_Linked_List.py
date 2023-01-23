# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #Initialize a "previous" and a "current" pointer
        #Set previous to none, since there is no previous node to the head, and current to the head of the linked list
        previous = None
        current = head
        #While the head is not null
        while current:
            #Initialize a "nxt" pointer as the next pointer of "current"
            nxt = current.next
            #Now assign the "previous" pointer to "current"'s next pointer
            current.next = previous
            #Assign the "current" pointer to the "previous" pointer, and the "next" pointer to "current"
            previous = current
            current = nxt
        return previous