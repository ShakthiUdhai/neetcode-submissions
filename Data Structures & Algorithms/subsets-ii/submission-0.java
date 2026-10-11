class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void dfs(int i,List<Integer> curr,int[] nums){
        if(i>=nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        //Path-1 Take i
        curr.add(nums[i]);
        dfs(i+1,curr,nums);

        //Path-2 skip i
        curr.remove(curr.size()-1);
        int j=i;
        while(j+1<nums.length && nums[j]==nums[j+1]){
            j++;
        }
        dfs(j+1,curr,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(0,new ArrayList<>(),nums);
        return res;
    }
}
