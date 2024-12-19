public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    if (llist == null) {
        return null;
    }
    SinglyLinkedListNode temp;
    temp = llist;
    while (temp != null && temp.next != null) {
        if (temp.data == temp.next.data) {
            temp.next = temp.next.next;
        } else {
            temp = temp.next;
        }
    }
    return llist;

}