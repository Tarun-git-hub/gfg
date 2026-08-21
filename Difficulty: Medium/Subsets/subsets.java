class Solution {
    static void solve(int arr[],int index,ArrayList<Integer> output,ArrayList<ArrayList<Integer>> ans){
        // base case
        if(index>=arr.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        // include
        int currValue=arr[index];
        output.add(currValue);
        solve(arr,index+1,output,ans);
        output.remove(output.size()-1);
        
        // exclude
        solve(arr,index+1,output,ans);
        
    }
    
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        int index=0;
         solve(arr,index,output,ans);
        return ans;
    }
}