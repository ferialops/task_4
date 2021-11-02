package ru.vsu.cs.kunakhova_a_y;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int n = enterN();

        if (n != 0){

            int result = findAmount(n);
            System.out.print(result);
        }
    }

    static int enterN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int value = sc.nextInt();
        if (value <= 0) {
            System.out.print("Value can be only more then 0");
            return 0;
        }
        return value;
    }

    static int findAmount(int n) {
        int firstNum = 0;
        int secondNum = 1;
        int amount = 0;
        while ((firstNum + secondNum) <= n) {
            int fibNum = firstNum + secondNum;
            if ((fibNum % 2) == 0) {
                amount = amount + fibNum;
            }
            firstNum = secondNum;
            secondNum = fibNum;
        }
        return amount;
    }
}
