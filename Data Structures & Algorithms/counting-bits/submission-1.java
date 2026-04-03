class Solution {
    public int[] countBits(int n) {
        int[] one = new int[n + 1];
        
        one[0] = 0;
        
        for (int i = 1; i < n + 1; i++){
            one[i] = Integer.bitCount(i);
        }
   
        return one;
    }

}
