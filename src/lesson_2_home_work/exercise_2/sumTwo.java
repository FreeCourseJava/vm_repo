//// ########## lesson_2 git lesson_2_home_work.exercise_2 ##########
// 2. Доработать метод из ДЗ предыдущего урока, увеличивающий баланс таким образом: если сложили 2 больших положительных числа, но получилось отрицательное - вернуть 0
package lesson_2_home_work.exercise_2;

public class sumTwo {
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