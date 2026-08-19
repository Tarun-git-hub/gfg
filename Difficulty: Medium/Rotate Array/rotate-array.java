class Solution {
    static void reverse(int arr[], int start, int end){
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
    }
    
    public void rotateArr(int arr[], int d) {
        // code here
         int n=arr.length;
        d=d%n;
        
        // reverse first d elements
        reverse(arr,0,d-1);
        
        // reverse remaining elements
        reverse(arr,d,n-1);
        
        // reverse whole array
        reverse(arr,0,n-1);
    }
}