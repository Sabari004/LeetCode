class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        int t=-1;
        double c=0;
        int n=arr.size();
        for(int i:arr){
            if(t==-1){
                t=i;
                c=1;
            }
            else if(t==i)c++;
            else {
                t=i;
                c=1;
            }
            if((c/n)*1000>250)return i;
        }
        return 0;
    }
};