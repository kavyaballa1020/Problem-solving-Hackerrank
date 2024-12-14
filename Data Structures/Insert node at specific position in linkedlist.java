static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
    SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
    if (llist == null) {
        llist = newnode;
        return llist;
    } else {
        newnode.next = llist;
        llist = newnode;
        return llist;
    }

}