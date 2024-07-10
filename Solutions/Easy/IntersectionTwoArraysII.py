class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        dic = {}
        res = []
        for el in nums1:
            if dic.get(el) is None:
                dic[el] = 1
            else:
                dic[el] +=1
        for el in nums2:
            if dic.get(el) is None or dic.get(el) <= 0:
                continue
            else:
                res.append(el)
                dic[el] -= 1
        return res
