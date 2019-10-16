package BinaryTree;

/**
 * Program to print the elements as Kth height of the binary Tree
 */
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class printKthElements {
    Node root;

    /**
     * Find Elements at Height k
     * @param node : the tree in which we are traversing to get the Elements
     * @param k : height at which you want the elements
     */
    void printKDistance(Node node, int k){
        if(node == null)
            return;
        if(k==0){
            System.out.println(node.data+" ");
            return;
        }else{
            printKDistance(node.left,k-1);
            printKDistance(node.right,k-1);
        }
    }
    public static void main(String[] args) {
        printKthElements tree = new printKthElements();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);
        tree.printKDistance(tree.root, 2);
    }
}
