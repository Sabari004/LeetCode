class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int num1[]=new int[n];
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        int m=0;
        // System.out.print(arr);
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            num1[m++]=it.next();
        }
        int []nums2=new int[m];
        for(int i=0;i<m;i++){
           nums2[i]=num1[i];
        }

        Arrays.sort(nums2);
        int mat[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){
                    mat[i][j]=0;
                }
                else if(nums[i-1]==nums2[j-1]){
                    mat[i][j]=1+mat[i-1][j-1];
                }
                else{
                    mat[i][j]=Integer.max(mat[i][j-1],mat[i-1][j]);

                }
            }
        }
            return mat[n][m];
    }
}