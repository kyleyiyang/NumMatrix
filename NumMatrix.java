class NumMatrix {
    int[][] sumRange;
    public NumMatrix(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        sumRange=new int[m+1][n+1];
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                sumRange[i+1][j+1]=sumRange[i+1][j]+sumRange[i][j+1]-sumRange[i][j]+matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumRange[row2+1][col2+1]-sumRange[row2+1][col1]-sumRange[row1][col2+1]+sumRange[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
