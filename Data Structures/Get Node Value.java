public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {

    SinglyLinkedListNode temp, temp1;
    temp = temp1 = llist;
    int count = 0;
    while (temp != null) {
        count++;
        temp = temp.next;
    }
    int position = count - positionFromTail;
    int i = 1;
    while (i < position) {
        temp1 = temp1.next;
        i++;
    }
    return temp1.data;
}