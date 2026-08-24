class Solution {
    void solve(int[] candidates,int tar,int i,List<Integer> ans1,List<List<Integer>> ans){
         if(tar==0){
            ans.add(new ArrayList<>(ans1));
            return;
         }
         if(tar<0||i==candidates.length)return;
         ans1.add(candidates[i]);
         solve(candidates,tar-candidates[i],i,ans1,ans);
         ans1.remove(ans1.size()-1);
         solve(candidates,tar,i+1,ans1,ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans1=new ArrayList<>();
        List<List<Integer>> ans =new ArrayList<>();
        solve(candidates,target,0,ans1,ans);
        return ans;
    }
}