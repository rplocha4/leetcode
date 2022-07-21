class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        final ListNode root = new ListNode();
        ListNode tmp = root;

        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                tmp.next = list2;
                list2 = list2.next;

            } else {
                tmp.next = list1;
                list1 = list1.next;

            }
            tmp = tmp.next;
        }
        tmp.next = list1 != null ? list1 : list2;
        return root.next;

    }
}