class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public int listSum(List<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
    public void dfs(int i,int[] nums,List<Integer> current,int target,int csum){
        if(csum==target){
            res.add(new ArrayList<>(current));
            return;
        }
        if(csum>target || i>=nums.length){
            return;
        }

        current.add(nums[i]);
        csum=listSum(current);
        dfs(i,nums,current,target,csum);

        current.remove(current.size()-1);
        //current.add(nums[i+1]);
        csum=listSum(current);
        dfs(i+1,nums,current,target,csum);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> current = new ArrayList<>();
        dfs(0,nums,current,target,0);
        return res;
    }
}
