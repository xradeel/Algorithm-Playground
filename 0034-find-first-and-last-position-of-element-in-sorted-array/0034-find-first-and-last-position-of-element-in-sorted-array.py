class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        start= 0
        end = len(nums)-1
        first, last = -1, -1
        while start <= end:
            mid = int((start + end)/2)
            if nums[mid] == target:
                first=mid
                end = mid -1
            elif nums[mid] < target:
                start = mid +1
            else:
                end = mid-1
        
        start= 0
        end = len(nums)-1      
        while start <= end:
            mid = int((start + end)/2)
            if nums[mid] == target:
                last=mid
                start = mid +1
            elif nums[mid] < target:
                start = mid +1
            else:
                end = mid-1
                
        return [first, last]