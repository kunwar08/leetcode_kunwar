class Solution {
public:
    bool uniformArray(vector<int>& nums1) {
        int odd=INT_MAX;
        int even=INT_MAX;
        for(int num:nums1){
            if(num&1){
                odd=min(odd,num);
            }
            else even=min(even,num);
        }
        if(odd==INT_MAX)return true;
        if(odd<even)return true;
        return false;
    }
};