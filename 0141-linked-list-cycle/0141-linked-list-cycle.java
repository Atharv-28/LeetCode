/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode itr1 = head;
        ListNode itr2 = head;
        while(itr2 != null && itr2.next != null)
        {
            itr1 = itr1.next;
            itr2 = itr2.next.next;
            if(itr1 == itr2)
            {
                return true;
            }
        }
        return false;
    }
}