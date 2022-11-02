//Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2 различных
//решения для действительных значений x. учитывая a, b и c, вы должны вернуть
//число решений в уравнение.

package com.company;

public class Task1 {

    public static void main(String[] args) {
        solutions(1, 0, -1);// 2
        solutions(1, 0, 0);// 1
        solutions(1, 0, 1);// 0
    }

    private static void solutions(int a, int b, int c) {
        int D = b*b - 4*a*c;    //дискриминант
        if (D>0) {
            System.out.println(2);
        }
        if (D==0) {
            System.out.println(1);
        }
        if (D<0) {
            System.out.println(0);
        }
    }

}
