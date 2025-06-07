/* Traverse the linked list and match the head to the key 
 * If any match found return true else false.
*/

class Solution {
    static boolean searchKey(int n, Node head, int key) {
        while(head!=null){
            if(head.data==key){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}