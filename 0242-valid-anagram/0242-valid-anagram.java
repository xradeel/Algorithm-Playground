class Solution {
        public boolean isAnagram(String s, String t) {

        int[] counts= new int[26];
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for(int count: counts){
            if (count != 0){
                return false;
            }
        }
        return true;
    }
}