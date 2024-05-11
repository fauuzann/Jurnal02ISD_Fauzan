public class BinaryTree {
    Node akar;

    public BinaryTree() {
        this.akar = null;
    }

    public void sisip(int data) {
        Node newNode = new Node(data);
        if (akar == null) {
            akar = newNode;
        } else {
            sisipRecursive(akar, newNode);
        }
    }

    private void sisipRecursive(Node current, Node newNode) {
        if (newNode.data < current.data) {
            if (current.kiri == null) {
                current.kiri = newNode;
            } else {
                sisipRecursive(current.kiri, newNode);
            }
        } else {
            if (current.kanan == null) {
                current.kanan = newNode;
            } else {
                sisipRecursive(current.kanan, newNode);
            }
        }
    }

    public void preOrderTraversal() {
        preOrderTraversalRecursive(akar);
    }

    private void preOrderTraversalRecursive(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversalRecursive(node.kiri);
            preOrderTraversalRecursive(node.kanan);
        }
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(akar);
    }

    private void inOrderTraversalRecursive(Node node) {
        if (node != null) {
            inOrderTraversalRecursive(node.kiri);
            System.out.print(node.data + " ");
            inOrderTraversalRecursive(node.kanan);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalRecursive(akar);
    }

    private void postOrderTraversalRecursive(Node node) {
        if (node != null) {
            postOrderTraversalRecursive(node.kiri);
            postOrderTraversalRecursive(node.kanan);
            System.out.print(node.data + " ");
        }
    }
}