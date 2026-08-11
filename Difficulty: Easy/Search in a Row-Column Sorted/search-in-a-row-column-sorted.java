class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int totalRow=mat.length;
        int totalCol=mat[0].length;
        
        int row=0;
        int col=totalCol-1;
        
        while(row < totalRow && col>=0){
            if(mat[row][col]==x){
                return true;
            }
            else if(mat[row][col]>x){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}