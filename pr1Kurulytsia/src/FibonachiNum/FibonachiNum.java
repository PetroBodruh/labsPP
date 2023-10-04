package FibonachiNum;
//імпортуємо клас для роботи з масивами
import java.util.ArrayList;
/**
 * Клас, що представляє число Фібоначчі і визначає, чи є воно квадратом.
 */
public class FibonachiNum{
    protected ArrayList<Long> num= new ArrayList<>();
    protected ArrayList<Long> numP= new ArrayList<>();
    protected int enNum;

    /**
     * Конструктор класу.
     * @param enNum Номер максимального числа Фібоначчі .
     */
    public FibonachiNum(int enNum) {

        this.enNum=enNum;
    }
    /**
     * метод для створення чисел Фібоначчі
     */
    protected   void prNum() {
        if(num.size()<(this.enNum) ){
        this.num.add(1L);
        this.num.add(1L);
        for(int i=2;i<=this.enNum-1;i++){
        this.num.add(this.num.get(i-2)+this.num.get(i-1));
        }
    }

    }
    /**
     * Метод для перевірки, чи є число квадратом.
     * @return true, якщо число є квадратом; false, якщо ні.
     */
    protected boolean isSquare(int i) {
            double sqrt =Math.sqrt(this.num.get(i));
            if(sqrt == Math.floor(sqrt)){
                this.numP.add(this.num.get(i));
                return true;
            }else return false;
        }
    /**
     * метод виведення  чисел Фібоначчі
     */
    public void getArrayFib(){
        prNum();
        System.out.println("Array "+enNum+" digits  Fibonacci : ");
        System.out.println(this.num);
        System.out.println("Array of Fibonacci digits which is square  :");
        System.out.println(this.numP);
    }
    /**
     * метод виведення чисел Фібоначчі з вказуванням чи є вони квадратоми чи ні
     */
    public void printFibNum(){
        prNum();
        for (int i=0;i<this.enNum;i++){
            System.out.printf("Number N= %d: %d",i, this.num.get(i));
            if(isSquare(i)){
                System.out.println(" - is square");
            }
            else System.out.println(" - is not square");
        }}}
