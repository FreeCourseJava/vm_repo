//// ########## lesson_1 git exercise_1 ##########
// 1. Написать метод увеличения счета (счет и часть для увеличения int, всегда положительные), объяснить какие могут быть проблемы.
package lesson1.home.work.git.exercises.exercise_1;

public class Sum {
    public static void main(String[] args) {
//        int total = getFinalScore(10,11);
        System.out.println(getFinalScore(10,11));
    }

    public static int getFinalScore (int bill, int partOfBill){
        return bill + partOfBill;
    }
}

// Возможна ситуации целочисленного переполнения
// Искуственное ограничение для отрицательных чисел и очень больших чисел
// Искуственное ограничение для случаев связанных с операцияями сложения с 0
// Искуственное ограничение для вещественных чисел