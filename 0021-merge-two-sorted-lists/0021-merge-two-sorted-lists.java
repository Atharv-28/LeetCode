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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode dummy=  new ListNode();
        dummy = merged;
        while(list1 != null || list2 !=null)
        {
            if(list1 != null && list2 != null)
            {
                if(list1.val < list2.val)
                {
                    merged.next = new ListNode();
                    merged = merged.next;
                    merged.val = list1.val;
                    list1 = list1.next;
                }   
                else if(list2.val < list1.val)
                {
                    merged.next = new ListNode();
                    merged = merged.next;
                    merged.val = list2.val;
                    list2 = list2.next;
                }
                else if(list1.val == list2.val)
                {
                    merged.next = new ListNode();
                    merged = merged.next;
                    merged.val = list1.val;
                    merged.next = new ListNode();
                    merged = merged.next;
                    merged.val = list2.val;
                    list1 = list1.next;
                    list2 = list2.next;
                }
            }
            else if(list1 ==null)
            {
                merged.next = new ListNode();
                merged = merged.next;
                merged.val = list2.val;
                list2 = list2.next;
            }
            else if(list2 == null){
                merged.next = new ListNode();
                merged = merged.next;
                merged.val = list1.val;
                list1 = list1.next;
            }
        }

        return dummy.next;
    }
}