package algorithm.sorting;

import algorithm.tree.BinarySearchTree;

import java.util.List;

public class TreeSort implements Sorting {
    public void sort(List<Integer> list) {
        // создаем двоичное дерево поиска
        BinarySearchTree bst = BinarySearchTree.createBinarySearchTree();
        // добавляем элементы списка в дерево
        bst.add(list);
        // делаем пустым список, чтобы при обходе дерева записать в него элементы в отсортированном виде
        list.clear();
        // обход дерева в порядке in-order, тем самым элементы дерева добавляются в список в отсортированном виде
        bst.traverseInOrder(bst.getRoot(), list);
    }
}
