class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Insert a node
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Search for a node
    boolean search(int key) {
        return searchRec(root, key) != null;
    }

    // A recursive function to search a key in BST
    Node searchRec(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    // Delete a node
    void deleteNode(int key) {
        root = deleteRec(root, key);
    }

    // A recursive function to delete a key in BST
    Node deleteRec(Node root, int key) {
        if (root == null) return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Inorder traversal
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Preorder traversal
    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder traversal
    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(5);
        bst.insert(3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(7);
        bst.insert(6);
        bst.insert(8);

        System.out.print("1. Inorder traversal: ");
        bst.inorder();
        System.out.print("2. Preorder traversal: ");
        bst.preorder();
        System.out.print("3. Postorder traversal: ");
        bst.postorder();

        System.out.println("Searching for 2: " + (bst.search(2) ? "Match" : "Not match"));
        System.out.println("Searching for 1: " + (bst.search(1) ? "Match" : "Not match"));

        bst.deleteNode(2);
        System.out.print("Inorder traversal after deleting 2: ");
        bst.inorder();
        System.out.print("Preorder traversal after deleting 2: ");
        bst.preorder();
        System.out.print("Postorder traversal after deleting 2: ");
        bst.postorder();

        bst.deleteNode(3);
        System.out.print("Inorder traversal after deleting 3: ");
        bst.inorder();
        System.out.print("Preorder traversal after deleting 3: ");
        bst.preorder();
        System.out.print("Postorder traversal after deleting 3: ");
        bst.postorder();

        bst.deleteNode(5);
        System.out.print("Inorder traversal after deleting 5: ");
        bst.inorder();
        System.out.print("Preorder traversal after deleting 5: ");
        bst.preorder();
        System.out.print("Postorder traversal after deleting 5: ");
        bst.postorder();
    }
}
