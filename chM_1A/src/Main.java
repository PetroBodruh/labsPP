import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Введення значень аргументів x1, x2, x3
        System.out.print("Введіть значення x1: ");
        double x1 = input.nextDouble();
        System.out.print("Введіть значення x2: ");
        double x2 = input.nextDouble();
        System.out.print("Введіть значення x3: ");
        double x3 = input.nextDouble();

        // Обчислення величини F
        double F = 2 * Math.pow(x1, 2) + 3 * Math.pow(x2, 2) + Math.pow(x3, 2) + 4 * x1 * x2 - 3 * x3 + Math.cos(x2 - x1);

        // Визначення кількості точних десяткових знаків
        int decimalPlaces = String.valueOf(F).split("\\.")[1].length();

        // Визначення першої значущої цифри
        int firstSignificantDigit = Integer.parseInt(String.valueOf(F).replace(".", "").substring(0, 1));

        // Виведення результатів
        System.out.println("Група: Ваша група");
        System.out.println("ПІБ студента: Ваше ПІБ");
        System.out.println("Номер ЛР і варіанту завдання: ЛР1, Варіант 1");
        System.out.println("Значення F: " + F);
        System.out.println("Кількість точних десяткових знаків: " + decimalPlaces);
        System.out.println("Перша значуща цифра: " + firstSignificantDigit);
    }
}
