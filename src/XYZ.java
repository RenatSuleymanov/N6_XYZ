import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число X ");
        float x = in.nextFloat();
        System.out.print("Введите число Y ");
        float y = in.nextFloat();
        System.out.print("Введите число Z ");
        float z = in.nextFloat();
        float xyz = (x+y+z)/3;
        System.out.println("Среднее арифметическое " + xyz);
        System.out.println("Среднее арифметическое/2 " + (int)xyz/2);
        if ((int)(xyz/2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
