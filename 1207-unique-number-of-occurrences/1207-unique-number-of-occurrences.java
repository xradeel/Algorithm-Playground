class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int k : arr) {
            if (!map.containsKey(k)) {
                map.put(k, 1);
            } else {
                map.put(k, map.get(k) + 1);
            }
        }
        boolean r=true;
        Object[] valArr= map.keySet().toArray(new Integer[0]);
        for (Object o : valArr) {
            int key = map.get(o);
            map.remove(o);
            if (map.containsValue(key)) {
                r = false;
            }
        }

        return r;
    }
}