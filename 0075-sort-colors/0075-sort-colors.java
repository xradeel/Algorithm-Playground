class Solution {
    public void sortColors(int[] nums) {
        int temp;
        for(int i=1; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j]<nums[i-1]){
                     temp = nums[i-1];
                    nums[i-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}