class Solution {
    public void reverseString(char[] s) {
        char[] reverse = new char[s.length];

        int j = s.length-1;
        for (int i = 0; i < s.length; i++){
            reverse[i] = s[j--];
        }

        for (int i =0; i < s.length; i++){
            s[i] = reverse[i];
        }

    }
}