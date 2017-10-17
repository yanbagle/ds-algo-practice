/**
 * Created by tuna on 2/15/2017.
 */
public class SymetricTree {

    public boolean isSymmetrical(Node root){
        if(root == null){
            return true;
        }

        return isSymmetrical(root.left, root.right);
    }

    public boolean isSymmetrical(Node left, Node right){
        if(left == null && right == null){
            return true;
        }
        else if(left == null || right == null){
            return false;
        }

        if(left.data != right.data){
            return false;
        }

        if(!isSymmetrical(left.left, right.right)){
            return false;
        }
        if(isSymmetrical(left.right, right.left)){
            return false;
        }

        return true;
    }

}
