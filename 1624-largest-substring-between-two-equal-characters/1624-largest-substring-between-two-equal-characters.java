class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int d=-1;
        int arr[]=new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']!=-1){
                d=(i-1-arr[s.charAt(i)-'a']<d)?d:i-1-arr[s.charAt(i)-'a'];
            }
            else arr[s.charAt(i)-'a']=i;
        }
        return d;
    }
}