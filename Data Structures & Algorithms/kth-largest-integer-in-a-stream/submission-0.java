class KthLargest {

    Queue<Integer> minHeap;
    int k;

    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        this.k=k;
        for(int num:nums){
            if(minHeap.size()<k){
                minHeap.offer(num);
            }
            else if(num>minHeap.peek()){
                minHeap.poll();
                minHeap.offer(num);
            }
        }
    }
    
    public int add(int val) {
        if(minHeap.size()<this.k){
            minHeap.offer(val);
        }
        else if(minHeap.peek()<val){
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
