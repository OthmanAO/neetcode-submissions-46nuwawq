class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int num : nums) {
        count.put(num, count.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
        (a, b) -> count.get(b) - count.get(a)  // max-heap: higher frequency first
    );

    maxHeap.addAll(count.keySet());

    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
        res[i] = maxHeap.poll();
    }
    return res;
    }   
}
