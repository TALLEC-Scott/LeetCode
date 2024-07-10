class Solution(object):
  def passThePillow(self, n, time):
      """
      :type n: int
      :type time: int
      :rtype: int
      """
  
      x = time % (2* (n-1))
      x+=1
      print(x)
      if x >= n:
          return n - (x % n)
      else:
          return x
