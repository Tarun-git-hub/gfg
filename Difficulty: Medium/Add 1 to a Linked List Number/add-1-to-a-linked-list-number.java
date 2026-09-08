/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node reverseLL(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node forward = curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // reverse list
        head = reverseLL(head);
        // add 1
        Node curr=head;
        int carry=1;
        while(curr!=null){
            int nodeValue=curr.data;
            int sum=carry+nodeValue;
            int digit=sum%10;
            curr.data=digit;
            carry=sum/10;
            if(curr.next==null && carry>0){
                curr.next=new Node(carry);
                carry=0;
            }
            curr=curr.next;
        }
        head = reverseLL(head);
        return head;
    }
}