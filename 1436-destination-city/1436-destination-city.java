class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map=new HashMap<>();
        String a="";
        for(int i=0;i<paths.size();i++){
            // if(map.containsKey(paths.get(i)){
            a=paths.get(i).get(0);
                map.put(a,paths.get(i).get(1));
        }
        // for(String a:map.keySet()){
        //     if(map.containsKey(map.get(a))){
        //         String t=map.get(a);
        //         map.put(a,map.get(map.get(a)));
        //         map.remove(t);
        //     }
        // }
        // return "";
        while(map.containsKey(a)){
            a=map.get(a);
        }
        return a;
    }
}