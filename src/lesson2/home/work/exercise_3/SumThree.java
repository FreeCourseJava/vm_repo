//// ########## lesson_2 git exercise_3 ##########
// 3. можно и даже лучше дорабоать во 2-ом задании текущего ДЗ.
// Оганизовать проверку таким образом: если складываем положительные числа, но получаем отрицательное, то вывести 0,
// если получаем положительное, но вычитаем из него большее (т.е. получаем отрицательное), то возвращаем отрицательное.
// Так же учесть кейс, когда у нас первое число отрицательное и второе положительное/отрицательное.
// Иначе говоря:  пытаемся придумать как проверить, что не произошло дерьмо с int overflow.
package lesson2.home.work.exercise_3;

public class SumThree {
    public static void main(String[] args) {
//        int bill=123, partOfBill=321; // два валидных полохительных числа
//        int bill=-123, partOfBill=-321; // два валидных полохительных числа
//        int bill=-123, partOfBill=-321; // два валидных числа (положительное и отрицательное)
//        int bill=Integer.MAX_VALUE, partOfBill=1; // два числа для случая int overflow
        int bill=Integer.MIN_VALUE, partOfBill=-111; // два числа для случая int underflow
        int finalScore = getFinalScore(bill,partOfBill);
        System.out.println("Результат сложения " + bill + " и " + partOfBill + " равен: " + finalScore);

    }
    public static int getFinalScore (int bill, int partOfBill){
        int sum = bill + partOfBill;
        if ( bill > 0 && partOfBill > 0) {
            if ( sum < 0 ) {
                System.out.println("Результат сложения привел к int overflow");
                return 0;
            }
            return sum;
        }
        if ( bill < 0 || partOfBill < 0) {
            if ( sum > 0 ) {
                System.out.println("Результат сложения привел к int underflow");
                return 0;
            }
            return sum;
        }
        return sum;
    }
}