package FibonachiNum;
//імпортуємо клас для роботи з масивами

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє число Фібоначчі і визначає, чи є воно квадратом.
 */
public class FibonachiNum { //SOLID
    protected List<Long> num = new ArrayList<>();
    protected List<Long> numP = new ArrayList<>();
    protected int enNum;

    /**
     * Конструктор класу.
     *
     * @param enNum Номер максимального числа Фібоначчі .
     */
    public FibonachiNum(int enNum) {
        this.enNum = enNum;
    }

    /**
     * метод для створення чисел Фібоначчі
     */
    protected void prNum() {
        if (num.size() < (enNum)) {
            num.add(1L);
            num.add(1L);
            for (int i = 2; i < enNum; i++) {
                num.add(num.get(i - 2) + num.get(i - 1));
            }
        }

    }

    /**
     * Метод для перевірки, чи є число квадратом.
     *
     * @return true, якщо число є квадратом; false, якщо ні.
     */
    protected boolean isSquare(long numb) {
        double sqrt = Math.sqrt(numb);
        if (sqrt == Math.floor(sqrt)) {
            numP.add(numb);
            return true;
        } else return false;
    }

    /**
     * метод виведення  чисел Фібоначчі
     */
    public void getArrayFib() {
        prNum();
        System.out.println("Array " + enNum + " digits  Fibonacci : ");
        System.out.println(num);
        System.out.println("Array of Fibonacci digits which is square  :");
        System.out.println(numP);
    }

    /**
     * метод виведення чисел Фібоначчі з вказуванням чи є вони квадратоми чи ні
     */
    public void printFibNum() {
        prNum();
        for (int i = 0; i < enNum; i++) {
            System.out.printf("Number N= %d: %d", i, num.get(i));
            if (isSquare(num.get(i))) {
                System.out.println(" - is square");
            } else System.out.println(" - is not square");
        }
    }
}
