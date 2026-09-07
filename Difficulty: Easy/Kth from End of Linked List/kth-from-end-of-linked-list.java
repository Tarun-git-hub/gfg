/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
      
        Node prev=head;
        Node curr=head;
        for(int i=1;i<=k;i++){
            if(curr==null){
                return -1;
            }
            curr=curr.next;
        }
        while(curr!=null){
            curr=curr.next;
            prev=prev.next;
        }
        int ans=prev.data;
        return ans;
    }
}