class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if((i & 1)!=1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}