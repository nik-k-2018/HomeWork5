public class Task8_8 {
    public static void main(String[] args) {
        int currentYear = 2023; // Текущий год
        int yearsToLookBack = 200;
        int yearsToLookAhead = 100;
        int cometInterval = 79;

        int startYear = currentYear - yearsToLookBack;
        int endYear = currentYear + yearsToLookAhead;

        System.out.println("Годы пролета кометы:");

        // Находим первый год в диапазоне, кратный 79
        int firstCometYear = ((startYear / cometInterval) + 1) * cometInterval;

        // Выводим все годы пролета кометы в заданном диапазоне
        for (int year = firstCometYear; year <= endYear; year += cometInterval) {
            System.out.println(year);
        }
    }
}