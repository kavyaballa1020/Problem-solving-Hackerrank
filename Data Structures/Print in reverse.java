public static void reversePrint(SinglyLinkedListNode llist) {
    if (llist == null) {
        return;
    } else {
        reversePrint(llist.next);
        System.out.println(llist.data);
    }
}