public class Task4_4 {
    public static void main(String[] args) {
        final double INITIAL_AMOUNT = 15_000;  // Стартовая сумма
        final double MONTHLY_RATE = 0.07;       // 7% в месяц
        final int YEARS = 9;                   // Срок в годах
        final int TOTAL_MONTHS = YEARS * 12;   // Всего месяцев
        final int REPORT_INTERVAL = 6;         // Отчёт каждые 6 месяцев

        double currentAmount = INITIAL_AMOUNT;

        System.out.println("=== Накопления Василия за 9 лет (каждые полгода) ===");

        for (int month = 1; month <= TOTAL_MONTHS; month++) {
            currentAmount *= (1 + MONTHLY_RATE);  // Начисляем проценты

            if (month % REPORT_INTERVAL == 0) {
                int halfYearCount = month / REPORT_INTERVAL;
                System.out.printf("Полугодие %d (%d месяц): %,10.2f рублей%n",
                        halfYearCount, month, currentAmount);
            }
        }
    }
}