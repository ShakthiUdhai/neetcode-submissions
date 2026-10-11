class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void dfs(int i,List<Integer> curr,int currSum,int[] candidates,int target){
        if(target==currSum){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i>=candidates.length || currSum>target){
            return;
        }

        //Pick i
        curr.add(candidates[i]);
        dfs(i+1,curr,currSum+candidates[i],candidates,target);

        //skip i
        curr.remove(curr.size()-1);
        int j=i;
        while(j+1<candidates.length && candidates[j]==candidates[j+1]){
            j++;
        }
        dfs(j+1,curr,currSum,candidates,target);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0,new ArrayList<>(),0,candidates,target);
        return res;
    }
}
