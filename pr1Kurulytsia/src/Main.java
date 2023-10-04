import FibonachiNum.FibonachiNum;
// імпортуємо бібліотеку сканер
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numF;
        if(args.length>0){numF=Integer.parseInt(args[0]);}//перевіряємо чи є аргументи в консолі
        else{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Num");
            numF=scan.nextInt();// зчитуємо інтове значення з консолі
            scan.close();
        }
        FibonachiNum object= new FibonachiNum(numF);// створюємо обєкт класу Фібоначчі
        // з параметром який ми зчитали з консолі

        object.printFibNum();// викликаємо метод класу для відображення числ Фібоначі
        object.getArrayFib();//виклик методу відображення масивів з числами Фібоначчі



    }
}