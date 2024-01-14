class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length,sum=0;
        int arrr[][]=new int[n][n];
        for(int k=0;k<n;k++){
            for(int i=0,j=k;j<n&&i<n;j++,i++){
                if(k==0)arrr[i][j]=arr[j];
                else arrr[i][j]=arrr[i][j-1]+arr[j];
                sum+=((j-i+1)%2==1)?arrr[i][j]:0;
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(arrr[i][j]+" ");
        //     }
        //         System.out.println();
        // }
        return sum;
    }
}