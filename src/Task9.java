public class Task9 {
    public static void main(String[] args) {
        double monthlyDeposit = 29_000;    // Ежемесячный вклад
        double annualRate = 0.12;          // 12% годовых
        double totalSavings = 0;           // Общая сумма с процентами

        for (int month = 1; month <= 12; month++) {
            // Начисляем проценты за месяц (1/12 годовой ставки)
            double monthlyInterest = totalSavings * annualRate / 12;
            totalSavings += monthlyDeposit + monthlyInterest;

            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей%n",
                    month, totalSavings);
        }
    }
}