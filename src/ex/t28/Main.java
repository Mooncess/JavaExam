package ex.t28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        n = scanner.nextInt();
        System.out.print("Сумма цифр: " + summ(n));
    }

    public static Integer summ(Integer n){
        int s = 0;
        if (n == 0) return 0;
        else {
            s+=n%10;
            s+=summ(n/10);
            return s;
        }
    }
}
