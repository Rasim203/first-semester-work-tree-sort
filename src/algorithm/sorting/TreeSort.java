package algorithm.sorting;

import algorithm.WrapInt;
import algorithm.tree.BinarySearchTree;

import java.util.List;

public class TreeSort implements Sorting {
    public void sort(List<Integer> list) {
        BinarySearchTree bst = BinarySearchTree.createBinarySearchTree();
        // добавляем элементы списка в дерево
        bst.add(list);
        // реальный размер списка, перед обходом он равен нулю
        // обертка над Integer нужна для того, чтобы при каждом вызове обхода, передавать ссылку на число, которое
        // будет хранить реальный рамер списка, чтобы не пересоздавать список, а изменять значения старого
        WrapInt listSize = new WrapInt(0);
        // обход дерева в порядке in-order, тем самым элементы дерева добавляются в список в отсортированном виде
        bst.traverseInOrder(bst.getRoot(), list, listSize);
        // список отсортирован
    }
}
