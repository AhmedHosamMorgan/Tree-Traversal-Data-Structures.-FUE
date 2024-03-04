import java.util.*;
public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        BinaryTree b = new BinaryTree();


        b.root = new Node(64);
        b.root.Left = new Node (54);
        b.root.Right = new Node(71);
        b.root.Left.Left = new Node(28);
        b.root.Left.Right= new Node (57);
        b.root.Left.Left.Right = new Node (35);
        b.root.Right.Right = new Node (84);
        b.root.Right.Left = new Node (68);
        b.root.Right.Left.Right = new Node(69);
        b.root.Right.Left.Left = new Node(67);

        // Print in Preorder
        b.preorder(b.root);

    }
}

