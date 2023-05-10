import algorithm.sorting.Sorting;
import algorithm.sorting.TreeSort;
import test.DataGenerator;
import test.DataReader;

import java.io.File;
import java.util.List;

public class Main2 {
    private static final String DATASET_DIRECTORY = "src\\test\\dataset";
    public static void main(String[] args) {
        Sorting sorting = new TreeSort();
        DataReader dr = new DataReader();
        List<File> listOfFiles = dr.getListOfFilesInFolder(DATASET_DIRECTORY);
        for (File file: listOfFiles) {
            List<Integer> numbers = dr.getNumbers(file);

        }
    }
}
