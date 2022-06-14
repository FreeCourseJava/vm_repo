//// ########## lesson_1 git lesson_2_home_work.exercise_3 ##########
// 3. Написать метод ничего не принимающий int и выводящий в консоль: Результат равен: значение_переменной овец (штук). Метод ничего не возращает, только выводит в консоль.
package lesson_1_home_work.exercise_3;

public class sheeps {
    public static void main(String[] args) {
        totalSheeps(20);
    }

    public static int totalSheeps (int sheeps){
        System.out.println("Результат равен: "+ sheeps +"овец (штук).");
        return 0;
    }
}

//Результат выполнения функции:
//      Результат равен: значение_переменной овец (штук).
//      Process finished with exit code 0