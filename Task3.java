//Создайте функцию, которая проверяет, является ли целое число совершенным
//числом или нет. Совершенное число - это число, которое можно записать как
//сумму его множителей, исключая само число.
//Например, 6-это идеальное число, так как 1 + 2 + 3 = 6, где 1, 2 и 3-Все коэффициенты 6.
//Точно так же 28-это совершенное число, так как 1 + 2 + 4 + 7 + 14 = 28.

package com.company;

public class Task3 {
    public static void main(String[] args) {
        checkPerfect(6);// true
        checkPerfect(28);// true
        checkPerfect(496);// true
        checkPerfect(12);// false
        checkPerfect(97);// false
    }

    private static void checkPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n%i==0)
                sum+=i;     //суммируем все множители числа, за исключением его самого
        }
        System.out.println(sum==n);     //сравниваем сумму с числом
    }
}
