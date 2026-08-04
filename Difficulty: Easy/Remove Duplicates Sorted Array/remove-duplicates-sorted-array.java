class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n=arr.length;
        int i=0;
        int j=1;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        for(int k=0;k<=i;k++){
            ans.add(arr[k]);
        }
        return ans;
    }
}
