package task_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataOutputCondition_7 {
    static final int X = 10,
            Y = 15,
            Z = 20;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int number = Integer.parseInt(reader.readLine());
        System.out.println(number == Y || number == X || number == Z ? "Данное значение имеется в константах" : "Такой константы нет!");
    }
}
