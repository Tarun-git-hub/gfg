class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        // transpose
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        // reverse all cols
        for(int col=0;col<n;col++){
            int strtRow=0;
            int endRow=n-1;
            while(strtRow<endRow){
                // swap
                int temp=mat[strtRow][col];
                mat[strtRow][col]=mat[endRow][col];
                mat[endRow][col]=temp;
                strtRow++;
                endRow--;
            }
        }
        
        
    }
}