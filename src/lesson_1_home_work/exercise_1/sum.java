//// ########## lesson_1 git lesson_2_home_work.exercise_1 ##########
// 1. Написать метод увеличения счета (счет и часть для увеличения int, всегда положительные), объяснить какие могут быть проблемы.
package lesson_1_home_work.exercise_1;

public class sum {
    public static void main(String[] args) {
        int bill=1, partOfBill=2;
        int total = getfinalScore(bill,partOfBill);
        System.out.println(total);

    }
    public static int getfinalScore (int bill, int partOfBill){
        int sum;
        sum = bill + partOfBill;
        return sum;
    }
}

// Возможна ситуации целочисленного переполнения
// Искуственное ограничение для отрицательных чисел и очень больших чисел
// Искуственное ограничение для случаев связанных с операцияями сложения с 0
// Искуственное ограничение для вещественных чисел