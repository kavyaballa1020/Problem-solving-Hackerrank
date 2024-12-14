public static void preOrder(Node root) {
    Node temp = root;
    if (root == null) {
        return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
}