//// ########## lesson_1 git exercise_3 ##########
// 3. Написать метод ничего не принимающий int, который выводит в консоль: Результат равен: значение_переменной овец (штук). Метод ничего не возращает, только выводит в консоль.
package lesson1.home.work.git.exercise3;

public class Sheeps {
    public static void main(String[] args) {
        totalSheeps(20);
    }

    public static int totalSheeps (int sheeps){
        System.out.println("Результат равен: " + sheeps + " овец (штук).");
        return 0;
    }
}

//Результат выполнения функции:
//      Результат равен: значение_переменной овец (штук).
//      Process finished with exit code 0
