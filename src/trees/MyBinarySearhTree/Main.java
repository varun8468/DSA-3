package trees.MyBinarySearhTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = new int[]{7, 8 , 1, 3, 2, 5, 10, 4};

        for(int num: nums){
            tree.insert(num);
        }
    }
}
