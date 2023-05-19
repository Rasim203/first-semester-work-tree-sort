package test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    // метод, который возвращает список всех тестовых файлов из директории "dataset"
    public List<File> getListOfFilesInFolder(String folderPath) {
        List<File> listOfFiles = new ArrayList<>();
        File folder = new File(folderPath);
        for (File file: folder.listFiles()) {
            listOfFiles.add(file);
        }
        return listOfFiles;
    }
    // метод возвращает список чисел из переданного в параметр файла
    public List<Integer> getNumbers(File file) {
        List<Integer> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);
            while (scanner.hasNextLine()) {
                int number = Integer.parseInt(scanner.nextLine());
                data.add(number);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
