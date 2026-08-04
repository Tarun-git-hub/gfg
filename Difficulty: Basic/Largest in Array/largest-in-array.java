class Solution {
    public static int largest(int[] arr) {
        // code here
        
        int n=arr.length;
        int maxi = arr[0];
        for(int i=1;i<n;i++){
                maxi = Math.max(arr[i],maxi);
            
        }
        
        return maxi;
        
    }
}
