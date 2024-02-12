class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums[0],c=1,n1=nums.length;
        for(int i=1;i<n1;i++){
            if(n==nums[i]){
                c++;
            }
            else{
                n=nums[i];
                c=1;
            }
            if(c>n1/2){
                return n;
            }
        }
        return n;
    }
}