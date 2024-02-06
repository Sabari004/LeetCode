class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        int n=strs.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int arr[]=new int[26];
            for(char j:strs[i].toCharArray()){
                arr[j-'a']++;
            }
            String t=Arrays.toString(arr);
            if(map.containsKey(t)){
                ans.get(map.get(t)).add(strs[i]);
            }
            else{
                map.put(t,ans.size());
                ArrayList<String> ar=new ArrayList<>();
                ar.add(strs[i]);
                ans.add(ar);
            }
            
            
        }
        return ans;
    }
}