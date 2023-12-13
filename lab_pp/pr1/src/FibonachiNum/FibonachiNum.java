package FibonachiNum;
//імпортуємо клас для роботи з масивами

import java.util.ArrayList;
import java.util.List;

/**
 *A class that represents a Fibonacci number and determines whether it is a square.
 */
public class FibonachiNum { //SOLID
    protected List<Long> num = new ArrayList<>();
    protected List<Long> numP = new ArrayList<>();
    protected int enNum;

    /**
     * Class construct.
     *
     * @param enNum num of maximal fibonacci digit .
     */
    public FibonachiNum(int enNum) {
        this.enNum = enNum;
    }

    /**
     * Method for create Fibonacci digits
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
     * Method for Checking, is digit square .
     *
     * @return true, if digit is square; false, if not.
     */
    protected boolean isSquare(long numb) {
        double sqrt = Math.sqrt(numb);
        if (sqrt == Math.floor(sqrt)) {
            numP.add(numb);
            return true;
        } else return false;
    }

    /**
     * Method of outputting  Fibonacci digit
     */
    public void getArrayFib() {
        prNum();
        System.out.println("Array " + enNum + " digits  Fibonacci : ");
        System.out.println(num);
        System.out.println("Array of Fibonacci digits which is square  :");
        System.out.println(numP);
    }

    /**
     * a method of deriving Fibonacci numbers, indicating whether they are square numbers or not
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
