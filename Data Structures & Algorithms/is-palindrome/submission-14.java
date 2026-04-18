class Solution {
    public boolean isPalindrome(String s) {
        String r = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int right = r.length() - 1;
        int left = 0;
        while (left <= right){
            if (r.charAt(left) != r.charAt(right)){
                return false;
            } else {
                right--;
                left++;

            }
        }    

        return true;
    }
}
