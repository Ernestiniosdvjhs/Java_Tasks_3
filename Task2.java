//Напишите функцию, которая возвращает позицию второго вхождения " zip " в
//строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
//быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
//произойти в строке.

package com.company;

public class Task2 {
    public static void main(String[] args) {
        findZip("all zip files are zipped");// 18
        findZip("all zip files are compressed");// -1
        findZip("all files are compressed");// -1
        findZip("all zip files are compressed an zipped and zipped again");// 32
    }

    private static void findZip(String s) {
        int index1 = s.indexOf("zip");  //находим номер первого вхождения zip в строку
        String s2 = s.substring(index1+3, s.length());  //новая строка, являющаяся копией первой после перовго слова zip
        int index2 = s2.indexOf("zip"); //номер второго вхождения zip в строку
        if (index2!=-1) {
            index2 = s2.indexOf("zip") + index1 + 3;    //если zip не равен -1 (если слово zip встречается еще хотя бы один раз), приибавляем к нему кол-во отсеченных при копировании элементов
        }
        System.out.println(index2);
    }
}
