import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan bilangan bulat : ");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");

        for (String s : inputs) {
            int data = Integer.parseInt(s);
            tree.sisip(data);
        }

        System.out.println("Traversal pre-order: ");
        tree.preOrderTraversal();
        System.out.println();

        System.out.println("Traversal in-order: ");
        tree.inOrderTraversal();
        System.out.println();

        System.out.println("Traversal post-order: ");
        tree.postOrderTraversal();
        System.out.println();
    }
}