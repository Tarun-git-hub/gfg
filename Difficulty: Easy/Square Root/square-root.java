class Solution {
    int floorSqrt(int n) {
        // code here
        int s=1;
        int e=n;
        int ans=-1;
        
        if(n==0){
            return 0;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(mid==n/mid){
                return mid;
            }
            else if(mid>n/mid){
                // move to left
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
}