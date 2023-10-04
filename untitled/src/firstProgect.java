import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class firstProgect {
    public static void main(String[] args){
        /*
        int mas=1111;
        System.out.println(mas);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter word");
        String word=scan.nextLine();
        int age =scan.nextInt();
        System.out.println("age= "+age);
        System.out.println("hello "+word);
        scan.nextLine();
        String wo=scan.nextLine();
        System.out.println("wo="+wo);

        String name=JOptionPane.showInputDialog("enter ur name");*/
        Random rand = new Random();

        for(int i= 0;i<10;i++){ int x = rand.nextInt(6,10);
        if(x>3)System.out.println(x);
        switch (x%2){
            case 1:System.out.println("one");
            break;
            case 0:System.out.println("par");
            break;
        }
        sum();

    }}
     static void sum(){
        System.out.println("sum sіum");
    }
}
