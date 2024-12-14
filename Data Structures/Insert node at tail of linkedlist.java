static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode temp;
    SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
    temp = head;
    if (head == null) {
        head = newnode;
        return head;
    } else {
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = null;
        return head;
    }
}