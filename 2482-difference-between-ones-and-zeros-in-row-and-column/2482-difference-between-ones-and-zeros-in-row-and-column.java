class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int col[]=new int[n];
        int row[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    col[i]++;
                    row[j]++;
                }
          }
        }
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=col[i]+row[j]-(n-col[i])-(m-row[j]);
            }
        }
        return arr;
    }
}