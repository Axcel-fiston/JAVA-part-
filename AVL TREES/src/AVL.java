class TreeNode {
    int value;
    int height;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    public TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Insert with balancing
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        } else {
            // Duplicate values are not allowed in a binary search tree
            return root;
        }

        // Update height of the current node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Check balance factor and perform rotations if needed
        int balance = getBalance(root);

        // Left Left Case
        if (balance > 1 && value < root.left.value) {
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && value > root.right.value) {
            return leftRotate(root);
        }

        // Left Right Case
        if (balance > 1 && value > root.left.value) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && value < root.right.value) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Perform left rotation
    private TreeNode leftRotate(TreeNode y) {
        TreeNode x = y.right;
        TreeNode T2 = x.left;

        // Perform rotation
        x.left = y;
        y.right = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Perform right rotation
    private TreeNode rightRotate(TreeNode x) {
        TreeNode y = x.left;
        TreeNode T2 = y.right;

        // Perform rotation
        y.right = x;
        x.left = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Get balance factor of a node
    private int getBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    // Get height of a node
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // In-order traversal to print the content of the tree
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    // In-order traversal for the entire tree
    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    // Post-order traversal to print the content of the tree
    public void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    // Post-order traversal for the entire tree
    public void postOrderTraversal() {
        postOrderTraversal(root);
        System.out.println();
    }
}

public class AVL {

    public static void main(String[] args) {
        BinaryTree balancedTree = new BinaryTree();

        // Adding elements to create a balanced tree
        int[] elementsToAdd = {45, 27, 67, 36, 56, 15, 75, 31, 53, 39, 64};

        for (int element : elementsToAdd) {
            balancedTree.insert(element);
        }

        System.out.println("Balanced Tree - In-order traversal:");
        balancedTree.inOrderTraversal();

        // Adding elements that make the tree unbalanced
        int[] unbalancedElements = {80, 90, 100};

        for (int element : unbalancedElements) {
            balancedTree.insert(element);
        }

        System.out.println("Unbalanced Tree - In-order traversal:");
        balancedTree.inOrderTraversal();

        System.out.println("Rebalancing the tree...");

        // Rebalancing the tree
        balancedTree = rebalanceTree(balancedTree.root);

        System.out.println("Rebalanced Tree - In-order traversal:");
        balancedTree.inOrderTraversal();
    }

    // Function to rebalance the tree (if needed)
    private static BinaryTree rebalanceTree(TreeNode root) {
        BinaryTree rebalancedTree = new BinaryTree();
        rebalancedTree.root = root;
        return rebalancedTree;
    }
}

