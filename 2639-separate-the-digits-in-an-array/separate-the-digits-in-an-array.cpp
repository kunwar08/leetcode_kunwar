class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        vector<int>ans;
        for(int i=0;i<nums.size();i++){
            string a=to_string(nums[i]);
            int x=0;
            while(x<a.length()){
                int temp=a[x]-'0';
                x++;
                ans.push_back(temp);
            }
        }
        return ans;
    }
};