class Solution {
    public int maxScore(String s) {
        char a[]=s.toCharArray();
        int n=a.length,l=0,max=0,r=0;
        for(int i=0;i<n;i++){
            l+=(a[i]-'0');
        }
        l-=a[0]-'0';
        r+=(a[0]=='0')?1:0;
        for(int i=1;i<n;i++){
            max=(max<l+r)?l+r:max;
            l-=a[i]-'0';
            r+=(a[i]=='0')?1:0;
        }
        return max;
    }
}