import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задані точні значення аргументів
        Scanner scann= new Scanner(System.in);
        System.out.println("перше число : ");
        double x1 = scann.nextDouble();
        System.out.println("друге чило : ");
        double x2 = scann.nextDouble();
        System.out.println("третє число : ");
        double x3 = scann.nextDouble();

        // Обчислення величини F
        double F = calculateF(x1, x2, x3);

        // Точне значення F (якщо воно вам відоме)
        double exactF = calculateExactF(x1+0.001, x2+0.001, x3+0.001);

        // Обчислення абсолютної похибки
        double absoluteError = Math.abs(exactF - F);

        // Обчислення відносної похибки (%)
        double relativeError = (absoluteError / Math.abs(exactF)) * 100.0;

        System.out.println("Величина F: " + F);
        System.out.println("Точне значення F: " + exactF);
        System.out.println("Абсолютна похибка: " + absoluteError);
        System.out.println("Відносна похибка (%): " + relativeError);
    }

    // Обчислення величини F на основі введених значень x1, x2, і x3
    private static double calculateF(double x1, double x2, double x3) {
        double term1 = 2 * x1 * x1;
        double term2 = 3 * x2 * x2;
        double term3 = x3 * x3;
        double term4 = 4 * x1 * x2;
        double term5 = 3 * x3;
        double term6 = Math.cos(x2 - x1);
        System.out.println("косинус "+term6);

        return term1 + term2 + term3 + term4 - term5 + term6;

    }

    // Обчислення точного значення F (якщо воно вам відоме)
    private static double calculateExactF(double x1, double x2, double x3) {
        // Ваш код для обчислення точного значення F на основі x1, x2, і x3
        double term1 = 2 * x1 * x1;
        double term2 = 3 * x2 * x2;
        double term3 = x3 * x3;
        double term4 = 4 * x1 * x2;
        double term5 = 3 * x3;
        double term6 = Math.cos(x2 - x1);
        return term1 + term2 + term3 + term4 - term5 + term6;
        // Замість цього, поверніть точне значення, якщо воно вам відоме
         // Замініть на відоме точне значення
    }
}
