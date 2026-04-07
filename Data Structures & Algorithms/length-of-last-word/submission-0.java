class Solution {
    public int lengthOfLastWord(String s) {
        
        int length = 0;
        int last = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' '){
                length++;
            } else {
                if (length != 0){
                    last = length;
                }
                length = 0;
            }
        }
        if (length != 0){
            return length;
        }
        
        return last;
    }
}