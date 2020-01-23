package task_12;

/*
Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteSpaces_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любой текст");
        String text = reader.readLine();
        System.out.println("Строка без пробелов:");
        System.out.println(text.replaceAll(" ", ""));
    }
}
