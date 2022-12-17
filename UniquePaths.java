class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] mat=new int[m][n];
        
        Arrays.fill(mat[0],1);
        
        for(int i=0;i<m;i++)
            mat[i][0]=1;
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++)
                mat[i][j]+=mat[i-1][j]+mat[i][j-1];
        }
        
        return mat[m-1][n-1];
    }
}
