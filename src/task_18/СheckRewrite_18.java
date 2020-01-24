package task_18;

import java.io.*;

/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class СheckRewrite_18 {
    public static void main(String[] args) {
        String text;
        String fileURL = "src/task_18/text.txt";
        int rowCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileURL));
            for (; (text = reader.readLine()) != null; rowCount++)
                System.out.println(text);
            reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(fileURL, false);
            for (String text1; rowCount-- > 0; writer.flush()) {
                text1 = reader.readLine();
                writer.write(text1 + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
