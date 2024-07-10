import numpy as np
import math
class Solution(object):
    def numWaterBottles(self, numBottles, numExchange):
        """
        :type numBottles: int
        :type numExchange: int
        :rtype: int
        """
        # Simulation solution
        # total = 0
        # emptyBottles = 0

        # while numBottles != 0:
        #     total += numBottles
        #     emptyBottles += numBottles
        #     numBottles = emptyBottles // numExchange
        #     emptyBottles -= numBottles * numExchange
        # return total
        # Math solution (There can be rounding errors so it's not optimal but it's a fun solution)
        numberIter = (np.emath.logn(numExchange, numBottles)) + 1
        print(numberIter)
        numberIter = int(math.ceil(numberIter))
        res = numBottles * (1 - (1./numExchange)**numberIter)/(1- (1./numExchange))
        print(res)
        res+= 0.0000000001
        return int(math.floor(res))
