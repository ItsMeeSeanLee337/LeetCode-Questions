# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        #The variable pre indicates the previous node. In the case of the initial head node, there is no previous node thus we will initialize it to self
        pre = self
        pre.next = head
        #While pre.next and pre.next.next is not empty, we will swap the nodes
        while pre.next and pre.next.next:
            #the order in which we will sswap the nodes is:
            #Initial: "pre -> a -> b -> b.next"
            #Swapped: "pre -> b -> a -> b.next"
            #First initialize variables "a" and "b"
            a = pre.next
            b = a.next
            #Then swap the variables, note the specific order in which we swap variables so we do not need to initialize placeholder nodes
            pre.next, b.next, a.next = b, a, b.next
            #Once we have swapped the variables, set the previous node to "a"
            pre = a
        return self.next