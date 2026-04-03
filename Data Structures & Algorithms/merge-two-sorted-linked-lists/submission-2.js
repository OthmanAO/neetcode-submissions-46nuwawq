/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} list1
     * @param {ListNode} list2
     * @return {ListNode}
     */
    mergeTwoLists(list1, list2) {
        let list = new ListNode(); 
        let dummy = list;       
        
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                list.next = list1;
                list1 = list1.next;
            } else {
                list.next = list2;
                list2 = list2.next;
            }

            list = list.next;
        }

        if (list1 === null){
            list.next = list2;
        }
        if (list2 === null){
            list.next = list1;
        }

        return dummy.next;
    }
}
