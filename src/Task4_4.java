public class Task4_4 {
    public static void main(String[] args) {
        double initialSavings = 15_000;  // Начальная сумма вклада
        final double MONTHLY_INTEREST_RATE = 0.07;  // 7% в месяц
        final double TARGET_AMOUNT = 12_000_000;  // Целевая сумма
        double currentSavings = initialSavings;
        int months = 0;

        // Цикл while (пока накопления меньше целевой суммы)
        while (currentSavings < TARGET_AMOUNT) {
            months++;
            currentSavings *= (1 + MONTHLY_INTEREST_RATE);  // Увеличиваем на 7%
            System.out.printf("Месяц %d, сумма накоплений: %.2f рублей%n", months, currentSavings);
        }

        System.out.printf("\nИтог: Василию потребуется %d месяцев, чтобы накопить %.2f рублей.%n", months, TARGET_AMOUNT);
    }
}