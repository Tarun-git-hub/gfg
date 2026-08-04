class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> result = new ArrayList<>();
        int startingRow = 0;
        int endingRow = n-1;
        int startingCol = 0; 
        int endingCol = m-1;
        
        while(startingRow<=endingRow && startingCol<=endingCol){
            // row wise left to right
            for(int col=startingCol;col<=endingCol;col++){
                result.add(mat[startingRow][col]);
            }
            startingRow++;
            
            // col wise top to bottom
            for(int row=startingRow;row<=endingRow;row++){
                result.add(mat[row][endingCol]);
            }
            endingCol--;
            // row wise right to left
        if(startingRow<=endingRow){
             for(int col=endingCol;col>=startingCol;col--){
                result.add(mat[endingRow][col]);
            }
            endingRow--;
        }
           
            // col wise bottom to top
           if(startingCol<=endingCol){
                for(int row=endingRow;row>=startingRow;row--){
                result.add(mat[row][startingCol]);
            }
            startingCol++;
           }
        }
        return result;
    }
}
