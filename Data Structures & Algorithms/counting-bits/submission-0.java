class Solution {
    public int[] countBits(int n) {
        int[] one = new int[n + 1];
        
        one[0] = 0;
        
        for (int i = 1; i < n + 1; i++){
            String binaryString = Integer.toBinaryString(i);
            
            int num = 0;
            for (char c : binaryString.toCharArray()) {
                if (c == '1'){
                    num++;
                }
            }
            one[i] = num;
        }
   
        return one;
    }

}
