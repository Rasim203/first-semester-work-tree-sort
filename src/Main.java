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
    public static void foo(Sorting sorting) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);
        sorting.sort(myList);
    }
    public static void main(String[] args) {
        Sorting treeSort = new TreeSort();
        DataReader dr = new DataReader();
        List<File> testFiles = dr.getListOfFilesInFolder(DATASET_DIRECTORY);
        foo(treeSort);
        for (File file: testFiles) {
            //foo(treeSort);
            //System.out.print(file.getName() + "  ");
            List<Integer> lst = dr.getNumbers(file);
            long start = System.nanoTime();
            treeSort.sort(lst);
            long finish = System.nanoTime();
            System.out.println((finish - start) / 1000);
        }

    }
}