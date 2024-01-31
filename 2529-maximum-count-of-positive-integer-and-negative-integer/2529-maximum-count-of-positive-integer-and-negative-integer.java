class Solution {
    public int maximumCount(int[] nums) {
        if(nums[0]>0 || nums[nums.length-1]<0) return nums.length;
        int pos=0;
        int neg=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0)pos++;
            else if(nums[i]<0)neg++;
            else continue;
        }
        if(pos>neg) return pos;
        else return neg;
        
    }
}