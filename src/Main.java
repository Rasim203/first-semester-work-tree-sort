import algorithm.sorting.Sorting;
import algorithm.sorting.TreeSort;
import algorithm.tree.BinarySearchTree;
import test.DataGenerator;
import test.DataReader;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final String DATASET_DIRECTORY = "src\\test\\dataset";
    public static void fillList(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            int number = (int) (Math.random() * 10 + 1);
            list.add(number);
        }
    }
    public static void main(String[] args) {
        Sorting sortingMachine = new TreeSort();

        List<Integer> arrayList = new ArrayList<>();
        fillList(arrayList, 10);
        System.out.println("ArrayList before sorting: " + arrayList);
        sortingMachine.sort(arrayList);
        System.out.println("ArrayList after sorting: " + arrayList);

        List<Integer> linkedList = new LinkedList<>();
        fillList(linkedList, 10);
        System.out.println("LinkedList before sorting: " + arrayList);
        sortingMachine.sort(linkedList);
        System.out.println("LinkedList after sorting: " + arrayList);


    }
}