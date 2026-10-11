class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void dfs(int i,int[] nums,List<Integer> subset){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        dfs(i+1,nums,subset);

        subset.remove(subset.size()-1);
        dfs(i+1,nums,subset);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        dfs(0,nums,subset);
        return res;
    }
}
