class Solution:
  def averageWaitingTime(self, customers: List[List[int]]) -> float:
      curr_time = 0
      total_waiting_time = 0
      for (arrival_time, time_taken) in customers:
          if arrival_time > curr_time:
              curr_time = arrival_time
          curr_time += time_taken
          total_waiting_time += curr_time - arrival_time
      return total_waiting_time / len(customers)
