class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++){
            if (set.add(nums[i])){
                continue;
            }
            set.remove(nums[i]);
        }

        Iterator<Integer> iterator = set.iterator();
        return iterator.next();
        
    }
        
}
