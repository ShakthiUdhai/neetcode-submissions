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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=1;
        ListNode count=head.next;
        while(count!=null){
            size+=1;
            count=count.next;
        }
        if(size==n){
            return head.next;
        }
        //starts
        ListNode first=head;
        ListNode second=head;
        ListNode res=head;
        for(int i=0;i<n;i++){
            first=first.next;
        }
        while(first.next!=null){
            second=second.next;
            first=first.next;
        }
        second.next=second.next.next;
        return res;
    }
}
