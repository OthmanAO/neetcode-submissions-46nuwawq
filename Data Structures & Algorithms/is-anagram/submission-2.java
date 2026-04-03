class Solution {
    public boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
        return false;  
    }
    
    HashMap<Character,Integer> letters1 = new HashMap<Character,Integer>();
    HashMap<Character,Integer> letters2 = new HashMap<Character,Integer>();
    
        for (char a : s.toCharArray()) {
            letters1.put(a, letters1.getOrDefault(a, 0) + 1);
        }

        for (char b : t.toCharArray()) {
            letters2.put(b, letters2.getOrDefault(b, 0) + 1);
        }

        return letters1.equals(letters2);
    
    }
}
