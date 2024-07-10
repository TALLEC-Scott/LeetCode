class Solution(object):
    def findTheWinner(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: int
        """
        players = range(n)
        print(players)
        index = 0
        k-=1
        while (len(players) > 1):
            index += k
            index %= len(players)
            
            print(players.pop(index))
            if index == len(players):
                index = 0
        print(players)
        return players[0] + 1
