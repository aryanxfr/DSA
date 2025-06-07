/*
 * Increase the counter untill and unless our head gets null
 * return the counter
 */

class Solution {
    public int getCount(Node head) {
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}