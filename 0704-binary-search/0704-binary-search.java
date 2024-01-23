class Solution {
    public int search(int[] nums, int target) {
        return binary(nums, nums.length, 0, target);
    }
    public static int binary(int[] nums, int end, int start, int target){
        int mid;
        end--;
        while(start<=end){
            mid= start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}