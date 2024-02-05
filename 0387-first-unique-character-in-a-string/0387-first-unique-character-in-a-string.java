class Solution {
    public int firstUniqChar(String s) {
        char a[]=s.toCharArray();
        int n=s.length();
        int j=0;
        int arr[]=new int[26];
        for(int i=0;i<n;i++){
            arr[a[i]-'a']++;
            while(j<i&&arr[a[j]-'a']>1)j++;
        }
        return arr[a[j]-'a']==1?j:-1;
    }
}