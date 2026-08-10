class Solution {
    
    static boolean isValidAns(int[] arr, int m, int mid){
        long totalWoodCollected=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid){
                long currentTreeWoodCollected=arr[i]-mid;
                totalWoodCollected+=currentTreeWoodCollected;
            }
        }
        if(totalWoodCollected>=m){
            return true;
        } else{
            return false;
        }
    }
    
    int maxHeight(int[] arr, int m) {
        // code here
        int n=arr.length;
        int s=0;
        int maxi=-1;
        
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        int ans=-1;
        int e=maxi;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(arr,m,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
        
    }
}
