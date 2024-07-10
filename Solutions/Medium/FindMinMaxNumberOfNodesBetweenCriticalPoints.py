# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        if head.next.next is None:
            return [-1,-1]
        def get_critical_points(head):

            i = 1            
            prev = head.val
            head = head.next
            curr = head.val
            res = []
            next_val = head.next.val
            if ((curr > prev and curr > next_val) or (curr < prev and curr < next_val)):
                res.append(i)
            while head.next.next is not None:
                i+=1
                prev = curr
                curr = next_val
                head = head.next
                next_val = head.next.val

                if ((curr > prev and curr > next_val) or (curr < prev and curr < next_val)):
                    res.append(i)
                        
            return res

        indexes =  get_critical_points(head)
        if len(indexes) <2 :
            return [-1, -1]
        max_dist = indexes[-1] - indexes[0]
        min_dist = indexes[-1]
        print(indexes)
        for i in range(0, len(indexes) -1):
            dist = indexes[i+1] - indexes[i]
            if dist < min_dist:
                min_dist = dist
        return [min_dist, max_dist]
