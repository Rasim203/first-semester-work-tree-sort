package algorithm.tree;

import java.util.List;

public class BinarySearchTree {
    /*
    Реализация бинарного дерева поиска:
    - оба поддерева - левое и правое - являются двоичными деревьями поиска
    - у всех узлов левого поддерева произвольного узла X значения ключей меньше, нежели значение ключа самого узла X
    - у всех узлов правого поддерева произвольного узла X значения ключей больше, чем значение ключа самого узла X
    - у каждого узла есть дополнительное поле - count - оно показывает количество вхождений значения ключа в это дерево
     */
    private int size = 0;
    public int iterations = 0;
    private Node root = null;
    private BinarySearchTree() { }
    public static BinarySearchTree createBinarySearchTree() {
        return new BinarySearchTree();
    }
    public void add(int value) {
        root = addRecursive(root, value);
        size++;
    }
    // добавляет в дерево поочередно элементы из списка
    public void add(List<Integer> list) {
        for (Integer number: list) {
            add(number);
        }
    }
    public void traverseInOrder(Node node, List<Integer> dest) {
        iterations++;
        if (node != null) {
            traverseInOrder(node.left, dest);
            for (int i = 0; i < node.count; i++) {
                dest.add(node.value);
            }
            traverseInOrder(node.right, dest);
        }
    }
    public int getSize() {
        return size;
    }
    public Node getRoot() {
        return root;
    }
    private Node addRecursive(Node current, int value) {
        iterations++;
        if (current == null) {
            return new Node(value);
        } else {
            if (value > current.value) {
                current.right = addRecursive(current.right, value);
            } else if (value < current.value) {
                current.left = addRecursive(current.left, value);
            } else {
                current.count++;
            }
            return current;
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "size=" + size +
                ", root=" + root +
                '}';
    }
}
