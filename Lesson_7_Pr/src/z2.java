import java.util.Scanner;

// Пользователь вводит с клавиатуры два числа. Нужно
//показать все четные числа в указанном диапазоне.
public class z2 {
    public void zz2() {
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
        for (int i = n1; i < n2 +1; i++)
        {
            if ((i % 2) == 0)  System.out.println("число i: " +i);


        }

    }

}
