// 876. Middle of the Linked List
// Link - https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        cur = head;
        int mid = count / 2 + 1;
        for(int i = 1; i < mid; ++i) {
            cur = cur.next;
        }
        return cur;
    }
}