import java.util.Scanner;
//Пользователь вводит с клавиатуры два числа. Нужно
//        посчитать сумму чисел в указанном диапазоне, а также
//        среднеарифметическое.
public class z4 {
    public void zz4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n1:\n");
        int n1 = scan.nextInt();
        System.out.println("Введите число n2:\n");
        int n2 = scan.nextInt();
        if (n1>n2) {
            int nn = n1;
            n1 = n2;
            n2 = nn;
            System.out.println("нормализация | min = n1: " +n1 +" | max = n2: "+n2);
        }
        int nn = 0;
        int i1 = nn;
        for (int i = n1; i < n2 +1; i++)
        {
             System.out.println("число i: " +i);
        nn = nn + i;
        i1 = i;
        }
        System.out.println("число сумму чисел: " +nn + " | среднеарифметическое: " + (nn/i1));
    }
}
