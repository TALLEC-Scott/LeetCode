class Solution:
    def minimumPushes(self, word: str) -> int:
        # distinct letters, we have 8 distinct keys
        # worst case scenario 26 
        # frequency sort, then you do distinct_keys_number / 3 to get the number of pushes
        hist = [[i, 0] for i in range(26)]
        for char in word :
            hist[ord(char)- ord('a')][1] += 1
        
        hist.sort(reverse=True, key=lambda li: li[1] )
        # drop all 0s
        res = 0
        for i in range(len(hist)):
            if (hist[i][1] == 0):
                continue
            weight = (i // 8) + 1
            print(weight)
            res += hist[i][1] * weight

        return res
        
