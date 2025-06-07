
/* Simple Approach
 * Create a new node.
 * point the new node to the head as new->head
 * update the head as the new node
 */

class Solution {
    public Node insertAtBegining(Node head, int x) {
        Node node=new Node(x);
        node.next=head;
        head=node;
        return head;
    }
}