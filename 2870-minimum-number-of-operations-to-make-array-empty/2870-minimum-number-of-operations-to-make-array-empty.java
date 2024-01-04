class Solution {
    public int solve(int N){
         for (int x = 0; x <= N / 2; x++) {
            for (int y = 0; y <= N / 3; y++) {
                if (2 * x + 3 * y == N) {
                    return x+y;
                }
            }
        }
        return -1;
    }
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int c=0;
        for(int i:map.values()){
            int t=solve(i);
            if(t==-1) return -1;
            else c+=t;
        }
        return c;
    }
}