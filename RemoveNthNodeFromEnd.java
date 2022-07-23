class RemoveNthNodeFromEnd {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode tmp = new ListNode(0, head);
        ListNode curr = head;

        while (n > 0) {
            curr = curr.next;
            n -= 1;
        }
        ListNode left = tmp;

        while (curr != null) {
            left = left.next;
            curr = curr.next;
        }
        left.next = left.next.next;

        return tmp.next;

    }
}