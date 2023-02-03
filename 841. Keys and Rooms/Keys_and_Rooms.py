class Solution(object):
    def canVisitAllRooms(self, rooms):
        """
        :type rooms: List[List[int]]
        :rtype: bool
        """
        # Create an empty set "visited_rooms" to keep track of which rooms we have visited
        visited_rooms = set()
        # We will use a stack to keep track of the number of rooms that we need to visit
        stack = [0]
        # While the stack is not empty
        while stack:
            room = stack.pop()
            visited_rooms.add(room)
            # For each key in the room that we are inspecting
            for key in rooms[room]:
                # Append the key to the stack if it is not already in the "visited_rooms" set
                if key not in visited_rooms:
                    stack.append(key)
        # If the length of the "visited_rooms" set is equal to the length of "rooms", that means we have visited all the rooms that are locked
        if len(visited_rooms) == len(rooms):
            return True
        else:
            False