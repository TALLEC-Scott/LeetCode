class Solution:
    def longestSubarray(self, nums: List[int]) -> int:

        max_val = nums[0]
        curr_len = 0
        res = 0
        for el in nums:  
            if el == max_val:
                curr_len +=1
            elif el > max_val:
                max_val = el
                curr_len = 1
                res = 1
            else:
                if (curr_len > res):
                    res = curr_len
                curr_len = 0 

        # if we only have the same bumber every      
        if (curr_len > res):
            res = curr_len

        return res
        
