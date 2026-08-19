class Solution {
    
    static void reverse(int[] arr, int start, int end){
        // reverse first group
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
        
       for(int start=0;start<n;start+=k){
           int end=start+k-1;
           
           if(end>=n){
               end=n-1;
           }
           reverse(arr,start,end);
       }
    }
}