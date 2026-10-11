class Solution {
    public int findMin(int[] nums) {
        int res = Integer.MAX_VALUE;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            if(nums[r]>nums[l]){
                res = Math.min(res,nums[l]);
            }
            int mid = l+(r-l)/2;
            res = Math.min(nums[mid],res);
            if(nums[mid]>=nums[l]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}
