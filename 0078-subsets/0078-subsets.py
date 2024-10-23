class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        output = [[]]
    
        for n in nums:
            output_len = len(output)
            for i in range(output_len):
                arr = output[i]
                new_arr = arr + [n]
                output.append(new_arr)

        return output