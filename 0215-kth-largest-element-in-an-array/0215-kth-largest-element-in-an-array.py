class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
    
      if len(nums)==1:
       return nums[0]
      f=int(len(nums))
      nums.sort()
      return int(nums[f-k])   