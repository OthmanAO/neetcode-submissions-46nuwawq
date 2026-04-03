class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", ""); 
        String reverse = "";
        
        char ch;
        for (int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            reverse = ch + reverse;
            
        }
        s = s.toLowerCase();
        reverse = reverse.toLowerCase();
        return s.equals(reverse);
    }
}
