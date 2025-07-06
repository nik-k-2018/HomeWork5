public class Task8 {
    public static void main(String[] args) {
        // --- Старое решение (копим 12 месяцев по 29 000 руб.) ---
        System.out.println("=== Накопления по 29 000 руб./мес ===");
        int monthly = 29_000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthly;
            System.out.printf("Месяц %d, сумма накоплений равна %,d рублей%n",
                    month, totalSavings);
        }

        // --- Новое решение (копим до цели) ---
        System.out.println("\n=== Копим 2 459 000 руб. по 15 000 руб./мес ===");
        int goal = 2_459_000;
        int monthlySavings = 15_000;
        totalSavings = 0;
        int months = 0;

        while (totalSavings < goal) {
            months++;
            totalSavings += monthlySavings;
            System.out.printf("Месяц %d: %,d руб.%n", months, totalSavings);
        }

        System.out.printf("Цель достигнута за %d месяцев%n", months);
    }
}