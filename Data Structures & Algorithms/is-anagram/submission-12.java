class Solution {
    public boolean isAnagram(String s, String t) {
        int[] x = new int[26];
        int[] y = new int[26];

        if (s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            x[s.charAt(i) - 'a']++;
            y[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(x, y);
    }
}
