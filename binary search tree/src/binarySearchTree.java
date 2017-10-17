/**
 * Created by tuna on 9/6/2016.
 */
public class binarySearchTree {

    Node root;

    public binarySearchTree(){}

    public void insert(int data){

        Node newNode = new Node(data);
        Node currentNode = root;
        Node parentNode = currentNode;

        if(currentNode == null){
            root = newNode;
            return;
        }

        while(currentNode != null){

            parentNode = currentNode;

            if(data > currentNode.data){
                currentNode = currentNode.right;
                if(currentNode == null){
                    parentNode.right = newNode;
                }
            }
            else{
                currentNode = currentNode.left;
                if(currentNode == null){
                    parentNode.left = newNode;
                }
            }
        }
    }

    public int find(int data){

        Node currentNode = root;

        while(currentNode != null){
            if(currentNode.data == data){
                return data;
            }
            else if(data > currentNode.data){
                currentNode = currentNode.right;
            }
            else{
                currentNode = currentNode.left;
            }
        }

        return -1;
    }

    public int delete(int data){

        Node currentNode = root;
        Node parentNode = currentNode;
        boolean isLeftChild = false;

        //traverse to node to be deleted
        while(currentNode.data != data){
            parentNode = currentNode;
            if(data > currentNode.data){
                currentNode = currentNode.right;
                isLeftChild = false;
            }
            else{
                currentNode = currentNode.left;
                isLeftChild = true;
            }
            if(currentNode == null){//unable to find node to be deleted
                return -1;
            }
        }

        //case 1: node has no children, a leaf node
        if(currentNode.left == null && currentNode.right == null){
            if(isLeftChild){
                parentNode.left = null;
            }
            else{
                parentNode.right = null;
            }
            return currentNode.data;
        }
        //case 2: node has 1 child
        else if(currentNode.left == null){
            if(currentNode == root){
                root = currentNode.right;
            }
            else if(isLeftChild){
                parentNode.left = currentNode.right;
            }
            else{
                parentNode.right = currentNode.right;
            }
        }
        else if(currentNode.right == null){
            if(currentNode == root){
                root = currentNode.left;
            }
            else if(isLeftChild){
                parentNode.left = currentNode.left;
            }
            else{
                parentNode.right = currentNode.left;
            }
        }
        //case 3: node has 2 children
        else if(currentNode.right != null && currentNode.left != null){
            Node successor = getSuccessor(currentNode);
            if(currentNode == root){
                root = successor;
            }
            else if(isLeftChild){
                parentNode.left = successor;
            }
            else{
                parentNode.right = successor;
            }
            successor.left = currentNode.left;
        }

        return currentNode.left.data;
    }

    public Node getSuccessor(Node deleteNode){
        Node successor = null;
        Node successorParent = null;
        Node currentNode = deleteNode.right;

        while(currentNode != null){
            successorParent = successor;
            successor = currentNode;
            currentNode = currentNode.left;
        }
        if(successor.right != null){
            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }
        return successor;
    }


}
