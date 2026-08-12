class Solution {
    
    static int getFirstOccurIndex(int[][] arr, int rowIndex){
        int totalRow=arr.length;
        int totalCol=arr[0].length;
        int target=1;
        int ans=-1;
        
        if(arr[rowIndex][totalCol-1]==0){
            return totalCol;
        }
        else{
            int s=0;
            int e=totalCol-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[rowIndex][mid]==0){
                    s=mid+1;
                }
                else{
                    ans=mid;
                    e=mid-1;
                }
            }
        }
        return ans;
        
    }
    
    public int rowWithMax1s(int[][] arr) {
        // code here
        
        int totalRow=arr.length;
        int totalCol=arr[0].length;
        int maxi=-1;
        int maxRowIndex=-1;
        
        for(int row=0;row<totalRow;row++){
            int firstOccIndex=getFirstOccurIndex(arr,row);
            int oneCount=totalCol-firstOccIndex;
            
            if(oneCount!=0 && oneCount>maxi){
                maxi=oneCount;
                maxRowIndex=row;
            }
        }
       return maxRowIndex;
        
    }
};