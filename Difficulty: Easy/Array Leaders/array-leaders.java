class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        int n=arr.length;
        int maxRight=arr[n-1];
        
        ans.add(maxRight);
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxRight){
                ans.add(arr[i]);
                maxRight=arr[i];
            }
        }
          int start = 0;
        int end = ans.size() - 1;

        while (start < end) {

            int temp = ans.get(start);

            ans.set(start, ans.get(end));
            ans.set(end, temp);

            start++;
            end--;
        }

        return ans;
       
    }
}
