class Solution {
    static int merge(int arr[],int s,int e, int mid){
        int leftArrLen=mid-s+1;
        int rightArrLen=e-mid;
        
        int leftArr[]= new int[leftArrLen];
        int rightArr[]= new int[rightArrLen];
        
        int k=s;
        for(int i=0;i<leftArrLen;i++){
            leftArr[i]=arr[k];
                k++;
        }
        k=mid+1;
        for(int j=0;j<rightArrLen;j++){
            rightArr[j]=arr[k];
            k++;
        }
        int i=0;
        int j=0;
        k=s;
        int invCount=0;
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
                k++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
                k++;
                invCount+=(leftArrLen-i);
            }
        }
        while(i<leftArrLen){
            arr[k]=leftArr[i];
                i++;
                k++;
        }
        while(j<rightArrLen){
            arr[k]=rightArr[j];
                j++;
                k++;
        }
        return invCount;
    }
    
    static int mergeSort(int arr[], int s, int e){
        if(s>e){
            return 0;
        }
        if(s==e){
            return 0;
        }
        int mid=(s+e)/2;
        
       int leftInversion = mergeSort(arr,s,mid);
       int rightInversion = mergeSort(arr,mid+1,e);
       int intermediateInversion=merge(arr,s,e,mid);
       int countInversion=leftInversion+rightInversion+intermediateInversion;
       return countInversion;
    }
    
    public int inversionCount(int arr[]) {
        // code here
        int s=0;
        int e=arr.length-1;
        int ans=mergeSort(arr,s,e);
        return ans;
    }
}