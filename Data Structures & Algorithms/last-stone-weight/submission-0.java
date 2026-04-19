class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1){
            return stones[0];
        }

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++){
            maxPQ.offer(stones[i]);
        }

        while (maxPQ.size() > 1){
            int y = maxPQ.poll();
            int x = maxPQ.poll();
            maxPQ.offer(y-x);
        }
        
        return maxPQ.peek();
    }
}
