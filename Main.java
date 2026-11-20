import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите целые числа через пробел: ");
            String line = in.nextLine().trim();
            if (line.isEmpty()) { System.out.println("Массив пуст."); return; }
            String[] parts = line.split("\\s+");
            int[] values = new int[parts.length];
            for (int i = 0; i < parts.length; i++) values[i] = Integer.parseInt(parts[i]);
            for (int end = values.length - 1; end > 0; end--) {
                boolean swapped = false;
                for (int i = 0; i < end; i++) if (values[i] > values[i + 1]) {
                    int tmp = values[i]; values[i] = values[i + 1]; values[i + 1] = tmp; swapped = true;
                }
                if (!swapped) break;
            }
            System.out.println("Отсортированный массив: " + Arrays.toString(values));
        } catch (NumberFormatException e) { System.out.println("Ошибка: вводите только целые числа."); }
    }
}
