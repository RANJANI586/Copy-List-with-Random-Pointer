/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node a=head;
        Node b=null;
        Node c=null;
        Map<Node,Node>node=new HashMap<>();
        while(a!=null){
            Node newNode=new Node(a.val);
            node.put(a,newNode);
            if(c==null)
            b=newNode;
            else
            c.next=newNode;
            c=newNode;
            a=a.next;
        }
        a=head;
        Node n=b;
        while(n!=null){
            n.random=node.get(a.random);
            n=n.next;
            a=a.next;
        }
        return b;
    }
}