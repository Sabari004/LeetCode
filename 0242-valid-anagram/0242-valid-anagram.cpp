class Solution {
public:
    bool isAnagram(string s, string t) {
        // int char[26];
        if(s.length()!=t.length()) return false;
        vector<int> arr(26,0);
        // for(int i=0;i<26;i++) cout<<arr[i]<<" ";
        for(int i=0;i<s.length();i++){
            arr[s[i]-'a']++;
            arr[t[i]-'a']--;
        }
        // for(int i=0;i<26;i++) cout<<arr[i]<<" ";
        for(int i=0;i<26;i++)if(arr[i]!=0) return false;
        return true;
    }
};