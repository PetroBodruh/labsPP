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

        // Введення номера варіанта N
        System.out.print("Введіть номер варіанта N: ");
        int N = input.nextInt();

        // Обчислення значення похибки Δ
        double delta = N * 1e-3;

        // Обчислення величини F з похибкою
        double F = 2 * Math.pow(x1, 2) + 3 * Math.pow(x2, 2) + Math.pow(x3, 2) + 4 * x1 * x2 - 3 * x3 + Math.cos(x2 - x1);

        // Обчислення відносної похибки величини F
        double relativeErrorF = delta / Math.abs(F);

        // Виведення результатів
        System.out.println("Група: Ваша група");
        System.out.println("ПІБ студента: Ваше ПІБ");
        System.out.println("Номер ЛР і варіанту завдання: ЛР1, Варіант 1");
        System.out.println("Значення F з похибкою: " + F);
        System.out.println("Похибка Δ: " + delta);
        System.out.println("Відносна похибка F: " + relativeErrorF);
    }
}
