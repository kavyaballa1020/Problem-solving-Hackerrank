public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
    if (llist == null) {
        return null;
    }
    SinglyLinkedListNode prev;
    SinglyLinkedListNode current;
    SinglyLinkedListNode nextnode;
    prev = null;
    current = llist;
    nextnode = current.next;
    while (nextnode != null) {
        current.next = prev;
        prev = current;
        current = nextnode;
        nextnode = nextnode.next;
    }
    current.next = prev;
    llist = current;
    return llist;

}
