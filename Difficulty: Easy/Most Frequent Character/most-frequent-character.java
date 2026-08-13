class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        char ans='z';
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int freq=map.get(ch);
            if(freq>max){
                max=freq;
                ans=ch;
            }
            else if(freq==max && ch<ans){
                ans=ch;
            }
        }
        return ans;
    }
}