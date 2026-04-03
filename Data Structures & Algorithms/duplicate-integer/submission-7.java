class Solution {

HashSet<Integer> dupe = new HashSet<Integer>();

    public boolean hasDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            if (!dupe.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
