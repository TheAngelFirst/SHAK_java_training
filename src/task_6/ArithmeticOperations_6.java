package task_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperations_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 числа x, y, z.");
        int x = Integer.parseInt(reader.readLine()),
                y = Integer.parseInt(reader.readLine()),
                z = Integer.parseInt(reader.readLine());
        double av = (x + z + y) / 3;
        System.out.printf("Среднее арифмитическое - %.2f%n", av);
        if (av / 2 > 3) System.out.print("Программа выполнена корректно");
    }
}
