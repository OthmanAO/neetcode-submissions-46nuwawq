class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] cur = strs[i].toCharArray();
            Arrays.sort(cur);
            String sortedCur = new String(cur);

            if (map.containsKey(sortedCur)){
                map.get(sortedCur).add(strs[i]);
            } else {
                map.put(sortedCur, new ArrayList<>());
                map.get(sortedCur).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());


    }
}
