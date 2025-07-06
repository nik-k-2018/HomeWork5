public class Task3_3 {
    public static void main(String[] args) {
        long currentPopulation = 12_000_000;  // Начальное население
        final double BIRTH_RATE_PER_1000 = 17.0;  // Рождаемость на 1000
        final double DEATH_RATE_PER_1000 = 8.0;   // Смертность на 1000
        final double GROWTH_RATE_PER_1000 = BIRTH_RATE_PER_1000 - DEATH_RATE_PER_1000;  // Прирост на 1000
        // Вариант с циклом while
        System.out.println("Расчёт с циклом while:");
        int yearWhile = 1;
        while (yearWhile <= 10) {
            currentPopulation += (long) (currentPopulation * GROWTH_RATE_PER_1000 / 1000);
            System.out.printf("Год %d, численность населения составляет %d%n", yearWhile, currentPopulation);
            yearWhile++;
        }
    }
}