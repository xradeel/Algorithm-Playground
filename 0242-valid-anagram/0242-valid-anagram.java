class Solution {
        public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> counts = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch_s= s.charAt(i);
            char ch_t= t.charAt(i);
            counts.put(ch_s, counts.getOrDefault(ch_s, 0)+1);
            counts.put(ch_t, counts.getOrDefault(ch_t, 0)-1);
        }
        for (char key : counts.keySet()) {

            if (counts.get(key) != 0) {
                return false;
            }
        }

        return true;
    }
}