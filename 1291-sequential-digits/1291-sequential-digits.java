class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String num="123456789";
        int m=Integer.toString(low).length();

        int n=Integer.toString(high).length()+1;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=m;i<=n;i++){
            for(int j=0;j<=9-i;j++){
                int t= Integer.parseInt(num.substring(j,j+i));
                if(t>=low&&t<=high) arr.add(t);;
            }
        }
        return arr;
    }
}