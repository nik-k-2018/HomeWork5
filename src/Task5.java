public class Task5 {
    public static void main(String[] args) {
        for (int year = 1904; year <= 2096; year += 4) {
            // Проверка на високосность (хотя шаг 4 уже гарантирует это)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            }
        }
    }
}