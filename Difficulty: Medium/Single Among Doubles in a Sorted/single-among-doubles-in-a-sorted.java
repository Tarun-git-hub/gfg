class Solution {
    int single(int[] arr) {
        // code here
        int n=arr.length;
        int s=0;
        int e=n-1;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(s==e){
                return arr[s];
            }
            
            int currValue=arr[mid];
            int prevValue=-1;
            if(mid-1>=0){
                prevValue=arr[mid-1];
            }
            int nextValue=-1;
            if(mid+1<n){
                nextValue=arr[mid+1];
            }
            
            
            if(currValue!=prevValue && currValue!=nextValue){
                return currValue;
            }
            
            if(currValue!=prevValue && currValue==nextValue){
                int startingIndexOfPair=mid;
                if((startingIndexOfPair&1)==1){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            } 
            else if(currValue==prevValue && currValue!=nextValue){
                int endingIndexOfPair=mid;
                if((endingIndexOfPair&1)==1){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            
        }
        return -1;
    }
}