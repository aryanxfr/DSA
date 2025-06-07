// Here we update the current nodes value to the next node and update the next pointer to the second next node .
//like this 1->2->3->4 and we have to delete 2
// 1->3->3->4 after updating the value and then skip the next node .
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}