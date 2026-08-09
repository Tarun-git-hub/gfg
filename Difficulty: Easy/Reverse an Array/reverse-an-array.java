class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int i=0;
        int j=n-1;
        int temp;
        
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
}