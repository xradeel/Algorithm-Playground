class Solution {
        public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> counts = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            counts.put(ch, counts.getOrDefault(ch, 0)+1);
        }
        for(int j=0; j<t.length(); j++){
            char ch= t.charAt(j);
            if(!counts.containsKey(ch)){
                return false;
            }else if(counts.get(ch)== 1){
                counts.remove(ch);
            }else{
                counts.put(ch, counts.get(ch)-1);
            }
        }
        return counts.size()==0;
     }
}