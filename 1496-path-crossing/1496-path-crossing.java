class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set=new HashSet<>();
        char a[]=path.toCharArray();
        int x=0,y=0;
         String d=Integer.toString(x);
            d+='%';
            d+=Integer.toString(y);
        set.add(d);
        for(int i=0;i<a.length;i++){
            // a.add()
            // b="";
            if(a[i]=='N')y++;
            else if(a[i]=='S')y--;
            else if(a[i]=='E')x++;
            else if(a[i]=='W')x--;
            String b=Integer.toString(x);
            b+='%';
            b+=Integer.toString(y);
            if(set.contains(b)) return true;
            else set.add(b);
        }
        return false;
    }
}