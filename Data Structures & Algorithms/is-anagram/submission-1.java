class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> letters1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> letters2 = new HashMap<Character,Integer>();

        if (s.length() != t.length()){
        return false;
        }

        for (char c : s.toCharArray()) {
            letters1.put(c, letters1.getOrDefault(c, 0) + 1);
        }

        for (char ca : t.toCharArray()) {
            letters2.put(ca, letters2.getOrDefault(ca, 0) + 1);
        }

        return letters1.equals(letters2);
    }
}
