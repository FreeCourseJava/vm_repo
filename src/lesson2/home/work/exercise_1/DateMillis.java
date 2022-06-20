//// ########## lesson_2 git exercise_1 ##########
// 1. Написать метод принимающий колличество дней (положительное или отрицательное) и возвращающий дату в виде таймстемпа (миллисикунды с 1970 года) в виде long.
package lesson2.home.work.exercise_1;
import java.util.concurrent.TimeUnit;

public class DateMillis {
    public static void main(String[] args) {
        int days = 10;
        long firstMethod = getFirstDaysIntoMillis(days);
        long secondMethod = getSecondDaysIntoMillis(days);
        System.out.println("Результат перевода " + days + " дней, в миллисекунды, с помощью первого метода: " + firstMethod);
        System.out.println("Результат перевода " + days + " дней, в миллисекунды, с помощью второго метода: " + secondMethod);
    }

    public static long getFirstDaysIntoMillis (int days){
        long firstDaysIntoMillis = TimeUnit.DAYS.toMillis(days);
        return firstDaysIntoMillis;
    }

    public static long getSecondDaysIntoMillis (int days){
        long secondDaysIntoMillis = (long)days * 24 * 60 * 60 * 1000;
        return secondDaysIntoMillis;
    }
}