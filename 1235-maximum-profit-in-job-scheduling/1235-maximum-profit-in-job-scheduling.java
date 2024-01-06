class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=profit.length;
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i]=new int[]{startTime[i],endTime[i],profit[i]};
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        map.put(0,0);
        for(int a[]:arr){
            int val=a[2]+map.floorEntry(a[0]).getValue();
            if(val>map.lastEntry().getValue()){
                map.put(a[1],val);
            }
        }
        return map.lastEntry().getValue();
    }
}