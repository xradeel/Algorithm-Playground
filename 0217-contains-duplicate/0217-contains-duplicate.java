class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicates= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(duplicates.containsKey(nums[i])){
                return true;
            }
            else{
                duplicates.put(nums[i],i);
            }
        }
        return false;
    }
}