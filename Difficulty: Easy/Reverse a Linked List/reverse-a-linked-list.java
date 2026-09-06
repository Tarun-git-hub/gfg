/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    
    public Node solve(Node prev, Node curr){
        if(curr==null){
            return prev;
        }
        Node forward = curr.next;
        curr.next=prev;

        // recursion
        return solve(curr,forward);
        
    }
    
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        
        Node ans = solve(prev,curr);
        return ans;
        
    }
}