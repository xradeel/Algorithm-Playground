class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int[] ans= new int[k];
        for(int j=0; j<k; j++){
            ans[j]= Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            map.remove(ans[j]);
        }
        return ans;
    }
}