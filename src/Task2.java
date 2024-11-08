// Дан массив объектов, где каждый объект представляет собой строку данных, и
// массив заголовков. Создайте строку CSV, где строки данных разделяются новой
// строкой, а значения в строках разделяются запятыми

class CSVGenerator {
    public static String generateCSV(String[] headers, String[][] data) {
// Введите свое решение ниже
        StringBuilder csv = new StringBuilder();
        csv.append(String.join(",", headers)).append("\n");


        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }
        return csv.toString().trim();
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {
        String[] headers = {};
        String[][] data = {};
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете  варьировать эти параметры
            headers = new String[]{"Name", "Age", "City"};
            data = new String[][]{
                    {"John", "30", "New York"},
                    {"Alice", "25", "Los Angeles"},
                    {"Bob", "35", "Chicago"}
            };
        } else {
// Преобразование строковых параметров в массивы
// Пример обработки данных можно дополнить в зависимости от формата args
        }
        CSVGenerator ans = new CSVGenerator();
        System.out.println(ans.generateCSV(headers, data));
    }
}
