class Solution {
    int n,m;
    public int solve(int arr[][],int k,int l){
        int sum=arr[k][l],c=1;
        if(k-1>=0){
            sum+=arr[k-1][l];
            c++;
        }
        if(l-1>=0){
            sum+=arr[k][l-1];
            c++;
        }
        if(k+1<n){
            sum+=arr[k+1][l];
            c++;
        }
        if(l+1<m){
            sum+=arr[k][l+1];
            c++;
        }
        if(k-1>=0&&l-1>=0){
            sum+=arr[k-1][l-1];
            c++;
        }
        if(k+1<n&&l+1<m){
            sum+=arr[k+1][l+1];
            c++;
        }
        if(k-1>=0&&l+1<m){
            sum+=arr[k-1][l+1];
            c++;
        }
        if(k+1<n&&l-1>=0){
            sum+=arr[k+1][l-1];
            c++;
        }
        return sum/c;
    }
    public int[][] imageSmoother(int[][] img) {
        n=img.length;m=img[0].length;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=solve(img,i,j);
            }
        }
        return arr;
    }
}