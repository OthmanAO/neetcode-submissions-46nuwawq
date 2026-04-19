class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;

        for (int i = arr.length - 1; i >= 0; i--){
            int update = max;
            max = Math.max(arr[i], max);
            if (i == arr.length - 1){
                arr[i] = -1;
            } else {
                arr[i] = update;
            }
        }
        return arr;
    }
}