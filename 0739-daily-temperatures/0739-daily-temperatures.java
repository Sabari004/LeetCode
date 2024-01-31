class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int nums[]=new int[71],n=temperatures.length;
        Arrays.fill(nums,-1);
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--){
                int min=Integer.MAX_VALUE;
            for(int j=temperatures[i]+1;j<=100;j++){
                if(nums[j-30]!=-1){
                    min=(min<nums[j-30]-i)?min:nums[j-30]-i;
                    // break;
                }
            }
            arr[i]=(min==Integer.MAX_VALUE)?0:min;
            nums[temperatures[i]-30]=i;
        }
        return arr;
    }
}