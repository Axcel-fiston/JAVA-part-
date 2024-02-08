class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }
}

public class binary {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        int[] elementsToAdd = {45, 27, 67, 36, 56, 15, 75, 31, 53, 39, 64};

        for (int element : elementsToAdd) {
            binaryTree.insert(element);
        }

        System.out.println("In-order traversal of the binary search tree:");
        binaryTree.inOrderTraversal();
    }
}
