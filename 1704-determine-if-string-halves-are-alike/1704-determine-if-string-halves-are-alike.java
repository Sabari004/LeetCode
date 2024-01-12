class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int c=0;
        char a[]=s.toCharArray();
        for(int i=0;i<n/2;i++){
            if(
            a[i]=='a'||
                a[i]=='u'||
                a[i]=='o'||
                a[i]=='i'||
                a[i]=='e'||
                a[i]=='U'||
                a[i]=='O'||
                a[i]=='I'||
                a[i]=='E'||
                a[i]=='A'
            )c++;
        }
        for(int i=n/2;i<n;i++){
            if(
            a[i]=='a'||
                a[i]=='u'||
                a[i]=='o'||
                a[i]=='i'||
                a[i]=='e'||
                a[i]=='U'||
                a[i]=='O'||
                a[i]=='I'||
                a[i]=='E'||
                a[i]=='A'
            )c--;
        }
        return c==0;
    }
}