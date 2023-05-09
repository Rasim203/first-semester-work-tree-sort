package algorithm.tree;

public class Node {
    int value;
    int count;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.count = 1;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", count=" + count +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
