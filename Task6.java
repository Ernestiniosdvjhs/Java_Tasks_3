//Напишите функцию, которая возвращает true, если два массива имеют одинаковое
//количество уникальных элементов, и false в противном случае.

package com.company;

public class Task6 {
    public static void main(String[] args) {
        same(new int[]{3, 4, 3, 4, 3, 4, 4, 1}, new int[]{2, 5, 7});// true
        same(new int[]{9, 8, 7, 6}, new int[]{4, 4, 3, 1});// false
        same(new int[]{2}, new int[]{3, 3, 3, 3, 3});// true
        same(new int[]{9, 8, 7, 6}, new int[]{4, 4, 3, 0, 1, 0});// true
    }

    private static void same(int[] a, int[] b) {
        int[] a1 = new int[a.length];   //создаем новй массив, равный по величине массиву a
        int x = 0;  //переменная x - количество уникальных символов
        int zero_counter = 0;   //переменная zero_counter - количество нулей
        for (int i = 0; i < a.length; i++) {    //перебираем элементы массива a
            int count = 0;  //переменная, равная количеству встреченных элементов в массиве a1, которые равны элементу массива а
            for (int j = 0; j < a1.length; j++) {    //перебираем элементы массива a1
                if (a[i]==a1[j])    //если встречен равный элемент, прибавляем 1 к count
                    count++;
                //т.к. массив a1 заполнен нулями, 0 из массива а сразу же не пройдет предыдущее условие, посему необходимо ввести новое
                if (a[i]==0 && zero_counter == 0) { //если элемент равен 0 и 0 встречется впервые, то
                    x++;                            //к количеству ункальных элементов прибавляем 1,
                    zero_counter++;                 //прибавляем 1 к zero_counter
                }
            }
            if (count == 0) {   //если цикл не выявил равных элементов, то
                a1[x] = a[i];   //добавляем в массив a1 элемент a[i],
                x++;            //добавляем к x 1
            }
        }

        //через абсолютно такой же цикл пропускаем второй массив(b)
        int[] b1 = new int[b.length];
        int y = 0;  //переменная y - количество уникальных символов
        zero_counter = 0;
        for (int i = 0; i < b.length; i++) {
            int count = 0;
            for (int j = 0; j < b1.length; j++) {
                if (b[i]==b1[j])
                    count++;
                if (b[i]==0 && zero_counter==0){
                    y++;
                    zero_counter++;
                }
            }
            if (count == 0) {
                b1[y] = b[i];
                y++;
            }
        }
        System.out.println(x==y);   //сравниваем между собой x и y
    }
}
