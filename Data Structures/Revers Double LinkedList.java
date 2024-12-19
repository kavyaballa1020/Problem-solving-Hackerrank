public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    if (llist == null) {
        return null;
    }
    DoublyLinkedListNode current, prevnode, nextnode;
    current = llist;
    prevnode = null;
    nextnode = current.next;
    while (nextnode != null) {
        current.prev = nextnode;
        current.next = prevnode;
        prevnode = current;
        current = nextnode;
        nextnode = nextnode.next;
    }
    current.prev = nextnode;
    current.next = prevnode;
    llist = current;
    return llist;
}
