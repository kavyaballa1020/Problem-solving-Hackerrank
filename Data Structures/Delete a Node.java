public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
    SinglyLinkedListNode temp, temp1;
    temp = llist;
    int i = 0;
    if (position == 0) {
        return llist.next;
    } else if (temp == null || temp.next == null) {
        return llist;
    } else {
        temp1 = null;
        while (i < position) {
            temp1 = temp;
            temp = temp.next;
            i++;
        }
        temp1.next = temp.next;
        return llist;
    }
}
