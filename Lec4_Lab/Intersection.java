package W.Lec4_Lab;

public class Intersection {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        ListNode curr2 = headB;
        while(curr1 != curr2){
            if(curr1 != null){
                curr1 = curr1.next;
            }else{
                curr1 = headA;
            }
            if(curr2 != null){
                curr2 = curr2.next;
            }else{
                curr2 = headB;
            }
        }
        return curr1;
    }
}
