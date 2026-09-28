class Solution {
public:
    int rotatedDigits(int n) {
        int ans=0;
        
      for(int i=1;i<=n;i++){
        int sign=0;
        int a=i;
        while(a>0){
            if(a%10==3||a%10==4||a%10==7)break;
            if(a%10==2||a%10==5||a%10==6||a%10==9)sign++;
            a/=10;
        }
        if(a==0&&sign>=1)ans++;
      } 
      return ans; 
    }
};