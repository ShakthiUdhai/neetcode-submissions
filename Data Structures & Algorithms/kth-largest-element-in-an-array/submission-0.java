class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            maxHeap.offer(num);
        }
        int res=0;
        for(int i=0;i<k;i++){
            res=maxHeap.poll();
        }
        return res;
    }
}
