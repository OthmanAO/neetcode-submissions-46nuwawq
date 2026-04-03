class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> vals = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++){
            if (!vals.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}