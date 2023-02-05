class Solution(object):
    def findSmallestSetOfVertices(self, n, edges):
        """
        :type n: int
        :type edges: List[List[int]]
        :rtype: List[int]
        """
        # Create the set "B" and populate it with every number from 0 to "n"
        # Set B represents all the nodes that need to be visited in the graph
        B = set(range(n))
        # We will loop through all the connections in the "edges" matrix and remove nodes that can be reached from other points, i.e. nodes that are no longer essential
        for x, y in edges:
            # If the "y" value is in set "B", remove the value from the set, i.e. the "y" node can be reached from another node and is now no longer essential
            if y in B:
                B.remove(y)
        # Convert the set "B" into a list and return it, "B" will now contain only essential nodes that are needed to reach all nodes in the graph
        return list(B) 