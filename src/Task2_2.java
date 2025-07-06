public class Task2_2 {
    public static void main(String[] args) {
        // Вариант с разными переменными для каждого цикла
        int i = 1; // Переменная для while

        // Цикл while (1-10)
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println(); // Переход на новую строку

        // Цикл for (10-1)
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
    }
}