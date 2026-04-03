class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length - 1;
        int i = 0;

        while (i < n){
            if (numbers[i] + numbers[n] == target){
                int[] res = new int[2];
                res[0] = i+1;
                res[1] = n+1;
                return res;
            } else if (numbers[i] + numbers[n] > target){
                n--;
            } else
                i++;
            }
        

        return null;
    }
}
