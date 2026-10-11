class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        Queue<int[]> maxHeap = new PriorityQueue<>((b,a)->(a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));
        for(int[] point : points){
            maxHeap.offer(point);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        for(int i=0;i<k;i++){
            res[i]=maxHeap.poll();
        }
        return res;

    }
}
