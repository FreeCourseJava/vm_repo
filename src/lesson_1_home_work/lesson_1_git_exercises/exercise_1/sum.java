//// ########## lesson_1 git lesson_1_home_work.lesson_1_git_exercises.exercise_3.exercise_1 ##########
// 1. Написать метод увеличения счета (счет и часть для увеличения int, всегда положительные), объяснить какие могут быть проблемы.
package lesson_1_home_work.lesson_1_git_exercises.exercise_1;

public class sum {
    public static void main(String[] args) {
        int total = getFinalScore(10,11);
        System.out.println(total);

    }
    public static int getFinalScore (int bill, int partOfBill){
        return bill + partOfBill;
    }
}

// Возможна ситуации целочисленного переполнения
// Искуственное ограничение для отрицательных чисел и очень больших чисел
// Искуственное ограничение для случаев связанных с операцияями сложения с 0
// Искуственное ограничение для вещественных чисел