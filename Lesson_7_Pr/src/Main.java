// Пользователь вводит с клавиатуры два числа. Нужно
// показать все числа в указанном диапазоне.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите 1-5:\n");
        Scanner scan = new Scanner(System.in);
        int slct = 4;
        switch (slct) {
            case 1:
                z1 Z1 = new z1();
                Z1.zz1();
                break;
            case 2:
                z2 Z2 = new z2();
                Z2.zz2(); break;
            case 3:
                z3 Z3 = new z3();
                Z3.zz3(); break;
            case 4:
                z4 Z4 = new z4();
                Z4.zz4(); break;
            default: System.out.println("Такого варианта нет:");
                scan.close();
        }
    }
}