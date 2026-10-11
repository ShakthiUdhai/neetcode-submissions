class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxInPile = Integer.MIN_VALUE;
        int l=0;
        int r=maxInPile-1;
        int res=0;
        while(l<=r){
            int mid = l+(r-l)/2;
            long totalTime=0L;
            for(int pile:piles){
                totalTime += (long) Math.ceil((double)pile/(mid+1));
            }
            if(totalTime<=h){
                r=mid-1;
                res = mid+1;
            }
            else if(totalTime>h){
                l=mid+1;
            }
        }
        return res;
    }
}
