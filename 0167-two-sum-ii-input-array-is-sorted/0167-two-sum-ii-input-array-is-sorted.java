class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
       int j=numbers.length-1;
       while(i<j){
           int num1= numbers[i];
           int num2= numbers[j];
           if(num1+num2==target) break;
           else if(num1+num2<target) i++;
           else j--;
       }
        return new int[]{i+1,j+1};
    }
}