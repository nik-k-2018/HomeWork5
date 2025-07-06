public class Task8 {
    public static void main(String[] args) {
        int monthlySavings = 29_000; // Сумма в месяц
        int totalSavings = 0;        // Общая сумма

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.printf("Месяц %d, сумма накоплений равна %,d рублей%n",
                    month, totalSavings);
        }
    }
}