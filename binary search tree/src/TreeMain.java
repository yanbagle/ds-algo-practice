/**
 * Created by tuna on 2/16/2017.
 */
public class TreeMain {
    public static void main(String [] args){
        BalancedTree balancedTree = new BalancedTree();
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.right.right = new Node(1);
        root.right.right.right = new Node(1);
        root.right.right.right.right = new Node(1);
        root.right.right.right.right.right = new Node(1);

        System.out.println(balancedTree.isBalanced(root));
    }
}
