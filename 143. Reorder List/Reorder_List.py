# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: ListNode
        :rtype: None Do not return anything, modify head in-place instead.
        """
        #To solve this problem we will use two pointers with the help of an auxillary O(n) space array
        #Intialize "arr", "current" pointer, and "length"
        arr = []
        current = head
        length = 0
        #while the "current pointer" is not null
        while current:
            #Append the current ListNode to the array "arr"
            arr.append(current)
            #Increment the "current" pointer and the "length"
            current = current.next
            length += 1
        #Now we will reorder the Linked List with two pointers
        left = 0
        right = length - 1
        last = head
        #While the "left" pointer does not go beyond the "right" pointer
        while left < right:
            #Set the "left" pointer's next node to the "right" pointer's node and increment the "left" pointer
            arr[left].next = arr[right]
            left += 1
            #If the "left" and "right" pointers intersect, set the "last" ListNode to the "right" pointer's ListNode and break
            if left == right:
                last = arr[right]
                break
            #Otherwise, set the "right" ponter's next node to the "left" pointer's node and decrement "right"
            arr[right].next = arr[left]
            right -= 1
            #Also set the "Last" ListNode to the "left" pointer's ListNode
            last = arr[left]
        #If the "Last" ListNode is not none, set the next node to none
        if last:
            last.next = None