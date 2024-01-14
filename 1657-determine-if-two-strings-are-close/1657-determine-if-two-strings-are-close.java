class Solution {
    public boolean closeStrings(String word1, String word2) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        if(word1.length()!=word2.length())return false;
        HashSet<Character> set=new HashSet<>();
        for(char i:word1.toCharArray()){
            arr1[i-'a']++;
            set.add(i);
        }
        for(char i:word2.toCharArray()){
            arr2[i-'a']++;
            if(set.contains(i))set.remove(i);
        }
        if(set.size()!=0)return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        int sum=0;
        while(i<26&&arr1[i]==arr2[i]){
            i++;
        }
        return i==26;
        // while(arr1[i]==0)i++;
        // while(arr2[j]==0)j++;
        // while(i<26&&j<26){
        //     if(arr1[i]==arr2[j]){
        //         i++;j++;
        //     }
        //     else if(arr1[i]<arr2[j]){
        //         // arr2[j]-=arr1[i];
        //         // i++;
        //         sum=0;
        //         while(i<26&&sum<arr2[j]){
        //             sum+=arr1[i];
        //             i++;
        //         }
        //         if(sum>arr2[j])return false;
        //         else if(sum==arr2[j])j++;
        //     }
        //     else{
        //         // arr1[i]-=arr2[j];
        //         sum=0;
        //         while(j<26&&sum<arr1[i]){
        //             sum+=arr1[j];
        //             j++;
        //         }
        //         if(sum>arr1[i])return false;
        //         else if(sum==arr1[i])i++;
        //         // j++;
        //     }
        // }
        // return i==j&&i==26;
        
    }
}