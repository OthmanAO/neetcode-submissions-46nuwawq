class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        int[] l1 = new int[26];
        int[] l2 = new int[26];

        for (int i = 0; i < s.length(); i++){
            l1[s.charAt(i) - 'a']++;
            l2[t.charAt(i) - 'a']++; 
        }

        return Arrays.equals(l1, l2);

    }
}
