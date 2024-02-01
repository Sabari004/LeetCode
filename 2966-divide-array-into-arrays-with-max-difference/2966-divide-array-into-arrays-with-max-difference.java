class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length/3;
        int arr[][]=new int[0][0];
        int arr1[][]=new int[n][3];
        Arrays.sort(nums);
        int j=-1;
        for(int i=0;i<n*3;i++){
            if(i%3==0)j++;
            if(i%3==0&&nums[i+2]-nums[i]>k) return arr;
            arr1[j][i%3]=nums[i];
            
            
        }
        return arr1;
    }
}