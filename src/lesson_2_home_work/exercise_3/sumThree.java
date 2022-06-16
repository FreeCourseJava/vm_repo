//// ########## lesson_2 git lesson_2_home_work.exercise_3 ##########
// 3. можно и даже лучше дорабоать во 2-ом задании текущего ДЗ. О
// Оганизовать проверку таким образом: если складываем положительные числа, но получаем отрицательное, то вывести 0,
// если получаем положительное, но вычитаем из него большее (т.е. получаем отрицательное), то возвращаем отрицательное.
// Так же учесть кейс, когда у нас первое число отрицательное и второе положительное/отрицательное.
// Иначе говоря:  пытаемся придумать как проверить, что не произошло дерьмо с int overflow.
package lesson_2_home_work.exercise_3;

public class sumThree {
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