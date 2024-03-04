public class BinaryTree {
    Node root ;
    BinaryTree()
    {
        root = null;
        System.out.println("\nPreorder Traversal. ");

    }

    // Print The Tree In Preorder
    public void preorder(Node node)
    {

        if (node == null)
            return;

        System.out.print("[" +node.item + "]");
        preorder(node.Left);
        preorder(node.Right);

    }
}
