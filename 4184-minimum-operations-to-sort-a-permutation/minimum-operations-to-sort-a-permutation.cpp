class Solution {
public:
    int minOperations(vector<int>& nums) {
        int n=nums.size();
        if(n==1)return 0;


        int start = find(nums.begin(),nums.end(),0)-nums.begin();

        bool asc=true;
        bool dsc=true;

        for(int i=1;i<n;i++){
            int value = nums[(start+i)%n];

            if(value != i){
                asc=false;
            }

            if(value!=n-i){
                dsc=false;
            }

            if(!asc && !dsc){
                return -1;
            }
        }

        if(asc){
            return min(start,n-start+2);
        }
        return min(n-start,start+2);
    }
};