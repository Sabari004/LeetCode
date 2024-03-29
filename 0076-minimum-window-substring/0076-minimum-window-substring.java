class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map = new HashMap<>();
        String st = "";
        int count = 0;
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                 
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                if(map.get(s.charAt(i))<=map1.get(s.charAt(i))){
                    count++;
                }
               // System.out.println(map);
            }
             if(count==t.length()){
                   
                   while(count==t.length()&&j<s.length()){
                       
                        String temp = s.substring(j,i+1);
                    if(st.length()>temp.length()||st.equals(""))
                        st = temp;
                       if(map.containsKey(s.charAt(j))){
                           if(map.get(s.charAt(j))-1<map1.get(s.charAt(j)))
                               count--;
                          map.put(s.charAt(j),map.get(s.charAt(j))-1);
                       }
                       j++;
                   }   
                }
        }
        return st;
    }
}