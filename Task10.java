//Учитывая три числа, x, y и z, определите, являются ли они ребрами
//прямоугольного треугольника.

package com.company;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        rightTriangle(3, 4, 5);// true
        rightTriangle(145, 105, 100);// true
        rightTriangle(70, 130, 110);// false
    }

    private static void rightTriangle(int x, int y, int z) {
        int[] triangle = new int[3];    //создаем массив на 3 элемента
        //добавляем стороны треугольника в массив
        triangle[0] = x;
        triangle[1] = y;
        triangle[2] = z;
        Arrays.sort(triangle);  //сортируем массив по возрастанию
        //сравниваем сумму квадратов двух первых элементов (катетов) с последним и самым большим (гипотенузой)
        System.out.println(( Math.pow(triangle[0],2) + Math.pow(triangle[1],2) ==  Math.pow(triangle[2],2)));
    }
}
