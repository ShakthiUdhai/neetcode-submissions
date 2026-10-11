/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        //Find Mid
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second = slow.next;
        slow.next=null;
        //Reverse second half
        ListNode prev=null;
        while(second!=null){
            ListNode temp = second.next;
            second.next=prev;
            prev=second;
            second=temp;
        }
        //
        second=prev;
        while(second!=null){
            ListNode temp1=head.next;
            ListNode temp2=second.next;
            head.next=second;
            second.next=temp1;
            head=temp1;
            second=temp2;
        }
    }
}
