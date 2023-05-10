package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class DataGenerator {
    // generate(N) - в директории src\test\dataset\ создается файл "File0..0N" с N числами
    // Числа генерируются в диапазоне -10000 .. 10000
    public void generate(int countOfNumbers) {
        int lenOfNumber = String.valueOf(countOfNumbers).length();
        String fileName = "File" + "0".repeat(6 - lenOfNumber) + countOfNumbers + ".txt";
        String pathname = "src\\test\\dataset\\" + fileName;
        try {
            // Создание файла
            File file = new File(pathname);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
            // запись чисел в файл
            FileWriter fw = new FileWriter(pathname, StandardCharsets.UTF_8);
            for (int i = 0; i < countOfNumbers; i++) {
                int number = (new Random()).nextInt() % 10001;
                fw.write(number + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
