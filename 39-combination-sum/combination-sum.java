class Solution {

    void solve(int[] candidates,int i,int k,List<Integer> ans1,List<List<Integer>> ans){
        if(k<0)return;
        if(k==0){
            ans.add(new ArrayList<>(ans1));
            return;
        }
        for(int j=i;j<candidates.length;j++){
           ans1.add(candidates[j]);
           solve(candidates,j,k-candidates[j],ans1,ans);
           ans1.remove(ans1.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>ans1=new ArrayList<>();
        List<List<Integer>>ans = new ArrayList<>();
        solve(candidates,0,target,ans1,ans);
        return ans;
    }
}