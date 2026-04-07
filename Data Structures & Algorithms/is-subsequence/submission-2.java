class Solution {
    public boolean isSubsequence(String s, String t) {
        int x = 0;
        int y = 0;

        if (s.length() == 0){
            return true;
        }

        while (y < t.length() && x < s.length()){
            if (s.charAt(x) == t.charAt(y)){
                x++;
                y++;
            } else {
                y++;
            }
        }  

        if (x != s.length()){
            return false;
        }
        

        return true;
    }
}