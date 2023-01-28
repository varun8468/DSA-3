package trees.MyBinarySearhTree;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public String toString(){
        return "Value= "+ data;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        TreeNode node = new TreeNode(value);
        if (root == null) {
            root = node;
            return;
        }

        TreeNode current = root;
        while (true) {
            if (value <= current.data) {
                if (current.left == null) {
                    current.left = node;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }
    }
}
