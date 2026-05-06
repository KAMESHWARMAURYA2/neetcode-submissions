class Solution {
    public int lastStoneWeight(int[] stones) {

       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int index = 0 ; index < stones.length; index ++) {
            maxHeap.offer(stones[index]);
        }

        while(maxHeap.size() >= 2) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if(x < y) {
                int newValue = y-x;
                maxHeap.offer(newValue);
            }
        }

        if(maxHeap.size() ==0) {
            return 0;
        }
        return maxHeap.poll();
        
    }
}
