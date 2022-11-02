//Напишите функцию, которая возвращает самую длинную последовательность
//последовательных нулей в двоичной строке.

package com.company;

public class Task8 {
    public static void main(String[] args) {
        longestZero("01100001011000");// "0000"
        longestZero("100100100");// "00"
        longestZero("11111");// ""
    }

    private static void longestZero(String s) {
        int mx = 0; //переменная, равная максимуму идущих подряд нулей в строке
        int count = 0;  //переменная, подсчитывающая нули
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0' ) {
                count++;    //если символ равен "0", прибавляем 1 к count
            }
            if (s.charAt(i) == '1' ) { //если символ равен "1", то
                if (count>mx)          //сравниваем count с mx, если последний меньше,
                    mx = count;        //к mx приравниеваем count
                count = 0;  //обнуляем count
            }
        }
        System.out.print(mx+" null: ");
        for (int i = 0; i < mx; i++)    //создаем цикл, проходящий mx раз
            System.out.print("0");  //при каждом прохождении выводим в строку "0"
        System.out.println();   //переходим на следующую строку
    }
}
