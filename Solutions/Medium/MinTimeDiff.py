class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:

        # sort using histo sort O(n) since this is dicrete
        # compute the difference between adjacent times
        # keep the min of these diffs
        # O(nlog(n)) + O(n) =  O(nlog(n)) using trad sort
        # O(n) + O(n) =  O(n) using bucket/histo sort


        def convert_to_mins(timePoint : str):
            hours = int(timePoint[:2])
            mins = int(timePoint[3:])
            return hours * 60 + mins

        sortedTimePoints = []
        hist = [False]*(24*60)
        for timePoint in timePoints:
            time = convert_to_mins(timePoint)
            if hist[time]: #duplicate:
                return 0
            hist[time]= True
        count = 0
        for i in range(24*60):
            if hist[i]:
                sortedTimePoints.append(i)
                
        min_dist = 24*60 - (sortedTimePoints[-1] - sortedTimePoints[0]) 
        
        # store tmp to improve
        for i in range(len(sortedTimePoints) - 1):
            dist = sortedTimePoints[i+1] - sortedTimePoints[i]
            min_dist = min(dist, min_dist)
        
        return min_dist
