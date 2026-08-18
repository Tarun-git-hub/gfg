class Solution {
    
    static void getAllSubsequences(String s, int i,StringBuilder output, List<String> ans ){
        // base case
        if(i>=s.length()){
            String subsequence = output.toString();
            ans.add(subsequence);
            return;
        }
        // include-exclude
        char ch = s.charAt(i);
        // include
        output.append(ch);
        getAllSubsequences(s,i+1,output,ans);
        // exclude
        output.deleteCharAt(output.length()-1);
        getAllSubsequences(s,i+1,output,ans);
    }
    
    public List<String> powerSet(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int i=0;
        getAllSubsequences(s,i,output,ans);
        Collections.sort(ans);
        return ans;
    }
}