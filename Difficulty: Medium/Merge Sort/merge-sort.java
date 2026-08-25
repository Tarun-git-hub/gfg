class Solution {
    static void merge(int arr[],int s, int e, int mid){
        int leftArrLen=(mid-s)+1;
        int rightArrLen=e-mid;
        
        int leftArr[] = new int[leftArrLen];
        int rightArr[] =  new int[rightArrLen];
        // copy arr into leftArr
        int k = s;
        for(int i=0;i<leftArrLen;i++){
            leftArr[i]=arr[k];
            k++;
        }
        // copy arr into rightArr
        k=mid+1;
        for(int j=0;j<rightArrLen;j++){
            rightArr[j]=arr[k];
            k++;
        }
        // merge both arr
        int i=0;
        int j=0;
        k=s;
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i]<rightArr[j]){
                arr[k]=leftArr[i];
                k++;
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
                k++;
            }
        }
        //if left arr is fully consumed and not right arr,copy remaining values of right
        while(j<rightArrLen){
            arr[k]=rightArr[j];
                j++;
                k++;
        }
        // if right arr is fully consumed and not left arr,copy remaining values of left
        while(i<leftArrLen){
            arr[k]=leftArr[i];
                k++;
                i++;
        }
    }
    
    public void mergeSort(int arr[], int l, int r) {
        // code here
        int s=l;
        int e=r;
        if(s>=e){
            return;
        }
        int mid=(s+e)/2;
        // sort leftside by recursion
        mergeSort(arr,s,mid);
        // sort rightside by recursion
        mergeSort(arr,mid+1,e);
        // merge both sides
        merge(arr,s,e,mid);
    }
}