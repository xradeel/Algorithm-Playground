class Solution {
    public int[] plusOne(int[] digits) {
       int last = digits.length-1;
        int total=0, md;
        for(int i=last; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}