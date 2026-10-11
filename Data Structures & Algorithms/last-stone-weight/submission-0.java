class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            maxHeap.offer(stones[i]);
        }
        while(maxHeap.size()>1){
            int stone1=maxHeap.poll();
            int stone2=maxHeap.poll();
            maxHeap.offer(Math.abs(stone1-stone2));
        }
        return maxHeap.poll();
    }
}
