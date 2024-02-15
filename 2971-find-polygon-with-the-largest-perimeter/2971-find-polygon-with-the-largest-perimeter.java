class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long s=0,max=-1,c=0;
        for(int i=0;i<nums.length;i++){
            c++;
            if(c>2&&s>nums[i])max=s+nums[i];
            s+=nums[i];
            // c++;
        }
        return max;
    }
}