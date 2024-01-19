class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        if(n==1) return matrix[0][0];
        int m=matrix[0].length, max=Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            matrix[i][0]+=(matrix[i-1][1]<matrix[i-1][0])?matrix[i-1][1]:matrix[i-1][0];
            for(int j=1;j<n-1;j++){
                
                matrix[i][j]+=(matrix[i-1][j-1]<matrix[i-1][j+1])?((matrix[i-1][j-1]<matrix[i-1][j])?matrix[i-1][j-1]:matrix[i-1][j]):((matrix[i-1][j+1]<matrix[i-1][j])?matrix[i-1][j+1]:matrix[i-1][j]);
            }
            matrix[i][n-1]+=(matrix[i-1][n-1]<matrix[i-1][n-2])?matrix[i-1][n-1]:matrix[i-1][n-2];
        }
        int i=n-1;
        matrix[i][0]+=(matrix[i-1][1]<matrix[i-1][0])?matrix[i-1][1]:matrix[i-1][0];
        max=(max<matrix[i][0])?max:matrix[i][0];
        for(int j=1;j<n-1;j++){
                
            matrix[i][j]+=(matrix[i-1][j-1]<matrix[i-1][j+1])?((matrix[i-1][j-1]<matrix[i-1][j])?matrix[i-1][j-1]:matrix[i-1][j]):((matrix[i-1][j+1]<matrix[i-1][j])?matrix[i-1][j+1]:matrix[i-1][j]);
            max=(max<matrix[i][j])?max:matrix[i][j];
        }
        matrix[i][n-1]+=(matrix[i-1][n-1]<matrix[i-1][n-2])?matrix[i-1][n-1]:matrix[i-1][n-2];
        max=(max<matrix[i][n-1])?max:matrix[i][n-1];
        return max;
    }
}