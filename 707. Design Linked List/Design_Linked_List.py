class ListNode:
    def __init__(self, val):
        self.val = val
        self.next = None

class MyLinkedList(object):
    #Implementation with singly linked list
    def __init__(self):
        self.head = None
        self.size = 0
        

    def get(self, index):
        """
        :type index: int
        :rtype: int
        """
        #If index is a negative number or index is greater than the size of the Linked List, the index is invalid and we must return -1
        if index < 0 or index >= self.size:
            return -1
        #Otherwise set a current pointer to the head of the Linked List
        current = self.head
        #Iterate through all the nodes in the linked list until we have reached the desired index number
        for i in range(0, index):
            current = current.next
        #Once we have reached the index, current.val will be the correct value and thus we should return it
        return current.val
        

    def addAtHead(self, val):
        """
        :type val: int
        :rtype: None
        """
        #Use the addAtIndex function we created, with index being 0 (the head of our linked list)
        self.addAtIndex(0, val)

    def addAtTail(self, val):
        """
        :type val: int
        :rtype: None
        """
        #Use the addAtIndex function we created, with index being self.size (the size of our linked list)
        self.addAtIndex(self.size, val)
        

    def addAtIndex(self, index, val):
        """
        :type index: int
        :type val: int
        :rtype: None
        """
        #If the index is greater than the size of the Linked List, exit from the function
        if index > self.size:
            return
        #Otherwise set a current pointer to the head of the Linked List and initialize ListNode(val) as new_node
        current = self.head
        new_node = ListNode(val)
        #If the index is 0, set new_node.next to current and make the head of the Linked List new_node
        if (index == 0):
            new_node.next = current
            self.head = new_node
        else:
            #Otherwise, iterate through all the ListNodes until we have reached the desired index
            for i in range(index - 1):
                current = current.next
            #Once we have reached the index, set new_node.next to the current ListNode's next pointer
            new_node.next = current.next
            #And set current.next to the new_node
            current.next = new_node
        #No matter if the index == 0 or index > 0, add to the size of the LinkedList
        self.size += 1

        

    def deleteAtIndex(self, index):
        """
        :type index: int
        :rtype: None
        """
        #If the index is a negative number or the index is greater than the size of the Linked List, exit from the function
        if index < 0 or index >= self.size:
            return
        #Otherwise set a current pointer to the head of the Linked List
        current = self.head
        #If the desired index number is 0, set the head of the Linked List to the next pointer
        if index == 0:
            self.head = self.head.next
        else:
            #Otherwise, iterate through all the ListNodes until we have reached the desired index
            for i in range(0, index - 1):
                current = current.next
            #Once we have reached the index, set current.next to the ListNode next to it, essentially deleting the ListNode at the desired index
            current.next = current.next.next
        #No matter if the index == 0 or index > 0, subtract from the size of the LinkedList
        self.size -= 1


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)