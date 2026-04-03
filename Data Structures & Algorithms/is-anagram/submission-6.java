class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        int[] lettersS = new int[26];
        int[] lettersT = new int[26];

        for (int i = 0; i < s.length(); i++){
            lettersS[s.charAt(i) - 'a']++;
            lettersT[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(lettersS, lettersT);

    }
}
