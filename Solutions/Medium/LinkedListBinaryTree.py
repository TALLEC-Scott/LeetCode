# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):


    def DFS(self, root, head):
        if root is None:
            return False
        elif self.look_ahead(root, head):
            return True
        return self.DFS(root.left, head) or self.DFS(root.right, head)
    def look_ahead(self, root, head):

        if head is None:
            return True
        if root is None or root.val != head.val:
            return False

        return self.look_ahead(root.left, head.next) or self.look_ahead(root.right, head.next)

    def isSubPath(self, head, root):
        """
        :type head: ListNode
        :type root: TreeNode
        :rtype: bool
        """
        return self.DFS(root, head)
        
