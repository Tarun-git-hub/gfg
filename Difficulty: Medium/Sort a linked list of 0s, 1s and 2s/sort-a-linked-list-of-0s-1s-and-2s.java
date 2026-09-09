/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
       
        // dummy nodes
        Node zeroHead  = new Node(-1);
        Node zeroTail = zeroHead;
        
        Node oneHead  = new Node(-1);
        Node oneTail = oneHead;
        
        Node twoHead  = new Node(-1);
        Node twoTail = twoHead;
        
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                Node nodeToInsert = temp;
                temp=temp.next;
                zeroTail.next=nodeToInsert;
                zeroTail=nodeToInsert;
            }
            else if(temp.data==1){
               Node nodeToInsert = temp;
                temp=temp.next;
                oneTail.next=nodeToInsert;
                oneTail=nodeToInsert; 
            }
            else if(temp.data==2){
                Node nodeToInsert = temp;
                temp=temp.next;
                twoTail.next=nodeToInsert;
                twoTail=nodeToInsert;
            }
        }
        // join
        zeroTail.next = (oneHead.next!=null)? oneHead.next : twoHead.next;
        oneTail.next=twoHead.next;
        twoTail.next=null;
        // delete zero dummy node
        zeroHead=zeroHead.next;
        return zeroHead;
    }
}