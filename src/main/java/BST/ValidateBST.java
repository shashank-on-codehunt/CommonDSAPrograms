package BST;

class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class ValidateBST {
    Node root;
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        ValidateBST tree = new ValidateBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBST(tree.root,null,null))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

    private boolean isBST(Node node, Node l, Node r) {
        if(node==null)
            return true;
        if(l != null && node.data <= l.data)
            return false;
        if(r != null && node.data > r.data)
            return false;

        return (isBST(node.left,l,node) &&
                isBST(node.right,node,r));
    }
    //Incorrect Method as it is not evaluating the whole tree we can use max and min of tree however that would increase the complexity
//    boolean isBST(Node node){
//        if(node == null)
//            return true;
//        if(node.left != null && node.left.data > node.data)
//            return false;
//        if(node.right != null && node.right.data < node.data)
//            return false;
//        if(!isBST(node.left) || !isBST(node.right))
//            return false;
//        return true;
//    }
}
