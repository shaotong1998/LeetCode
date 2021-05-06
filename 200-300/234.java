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
    public boolean isPalindrome(ListNode head) {

        if(head.next == null || head == null){
            return true;
        }
       
        int size = 0;
      
        //遍历一遍转换成LinkedList链表
        //LinkedList<Integer> stack = new LinkedList<Integer>();
        ArrayList<Integer>  stack = new ArrayList<Integer>();
        while(head != null){
            size++;
            stack.add(head.val);

            head = head.next;
        } 

        //双指针
        int mid = size/2;
        //偶数的话 0~mid-1 mid~size-1
        //奇数的话 0~mid-1 mid+1~size-1
        size = size-1;
        for(int i = 0; i < mid ;i++){
            if(stack.get(i) != stack.get(size-i)){
                return false;
            }
        }
        return true;
    }
}