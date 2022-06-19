//// ########## lesson_2 git exercise_2 ##########
// 2. Доработать метод из ДЗ предыдущего урока, увеличивающий баланс таким образом: если сложили 2 больших положительных числа, но получилось отрицательное - вернуть 0
package lesson2.home.work.exercise_2;

public class SumTwo {
    public static void main(String[] args) {
        int bill=10, partOfBill=333; // Пример для валидного сложения
//        int bill=10, partOfBill=Integer.MAX_VALUE; // Пример для целочисленного переполения
        int finalScore = getFinalScore(bill,partOfBill);
        System.out.println("Результат сложения " + bill + " и " + partOfBill + " равен: " + finalScore);

    }
    public static int getFinalScore (int bill, int partOfBill){
        int sum = bill + partOfBill;
        if ( sum < 0 ) {
            return 0;
        }
        return sum;
    }
}