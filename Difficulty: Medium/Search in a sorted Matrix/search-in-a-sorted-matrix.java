class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int totalRow=mat.length;
        int totalCol=mat[0].length;
        int n=totalRow*totalCol;
        
        int s=0;
        int e=n-1;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            int rowIndex=mid/totalCol;
            int colIndex=mid%totalCol;
            if(mat[rowIndex][colIndex]==x){
                return true;
            }
            else if(mat[rowIndex][colIndex]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}
