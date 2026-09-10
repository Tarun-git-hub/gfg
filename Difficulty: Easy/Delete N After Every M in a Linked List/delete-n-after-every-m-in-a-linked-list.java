/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node curr=head;
        Node prev=null;
        
        while(curr!=null){
            //ignore
            for(int i=1;i<=m && curr!=null;i++){
                prev=curr;
                curr=curr.next;
            }
            if(curr==null){
               break;
            }
            //delete
            for(int i=1;i<=n && curr!=null;i++){
                curr=curr.next;
            }
            // link arrange
            prev.next=curr;
        }
        
    }
}