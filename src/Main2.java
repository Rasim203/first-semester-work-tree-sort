import algorithm.sorting.Sorting;
import algorithm.sorting.TreeSort;
import test.DataGenerator;
import test.DataReader;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        DataGenerator dg = new DataGenerator();
        for (int i = 0; i <= 33; i++) {
            dg.generate(100 + 300 * i);
        }
    }
}
