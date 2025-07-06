public class Task7_7 {
    public static void main(String[] args) {
        int firstFriday = 5; // Первая пятница месяца (например, 5-е число)
        int daysInMonth = 31; // Всего дней в месяце

        System.out.println("Напоминания о подготовке отчета:");

        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет%n", day);
        }
    }
}