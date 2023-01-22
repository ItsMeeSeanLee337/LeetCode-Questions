# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        #Create a variable carry to keep track of when two
        carry = 0
        #set result and a pointer variable to a dummy ListNode; ListNode(0) creates a ListNode with a value of 0
        result = pointer = ListNode(0)
        #While l1 or l2 or carry are not empty; same as saying if l1 != null
        while l1 or l2 or carry:
            #Set the firstNum and secondNum variables depending on if l1 or l2 are empty
            firstNum = l1.val if l1 else 0
            secondNum =l2.val if l2 else 0
            #Find the sum of the firstNum, seccondNum, and carry variables
            sum = firstNum + secondNum + carry
            #set the variable num to sum modulo 10, i.e. the last digit of the sum
            num = sum % 10
            #set the carry variable to the integer division of sum by 10 
            carry = sum // 10
            #set pointer.next to a new ListNode with a value of num
            pointer.next = ListNode(num)
            #advance the pointer
            pointer = pointer.next
            #advance l1 and l2 if possible
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        #return result.next, which should point to the start of the pointer ListNodes
        return result.next