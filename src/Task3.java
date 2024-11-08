// Дана строка с несколькими строками текста, разделенными переводами строки.
// Напишите метод, который удаляет все пустые строки из текста.


import java.lang.reflect.Array;

class TextCleaner {
    public static String removeEmptyLines(String text) {
// Введите свое решение ниже
       String [] lines =  text.split("/n");

        StringBuilder cleanedText = new StringBuilder();
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                    cleanedText.append("\n");
                }
                cleanedText.append(line);
            }
        }
        return cleanedText.toString();

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов наэкран и проверки
public class Task3 {
    public static void main(String[] args) {
        String text = "";
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете            варьировать эти параметры
            text = "line1\n       \n   \n   \n\nline2\n       \nline3";
        } else {
            text = args[0];
        }
        TextCleaner ans = new TextCleaner();
        System.out.println(ans.removeEmptyLines(text));
    }
}
