class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int num : nums) {
        count.put(num, count.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>(
        (a, b) -> count.get(a) - count.get(b)  // min-heap based on frequency
    );

    for (int num : count.keySet()) {
        heap.add(num);
        if (heap.size() > k) {
            heap.poll();  // remove the element with smallest frequency
        }
    }

    int[] res = new int[k];
    for (int i = k - 1; i >= 0; i--) {
        res[i] = heap.poll();
    }
    return res;
    }   
}
