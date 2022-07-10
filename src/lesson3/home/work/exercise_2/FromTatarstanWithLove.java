//// ########## lesson_3 git exercise_2 ##########
// 2. Составить массив из значимых годов Республики Татартсан (любые 20), добавить их в массив в рандомном порядке.
// Написать метод, принимающий массив годов (интов) и возвращающий их в отсортированном порядке.
// Сортировку реализовать методом bubble sort (пузырьковая сортировка). Для тех кто осилил второе задание.
package lesson3.home.work.exercise_2;

public class FromTatarstanWithLove {
    public static void main(String[] args) {

        int[] tatarstanInterestingYears = {1408, 1611, 1005, 1654, 1801, 1791, 1855, 1431, 1770, 1758, 1524, 1236, 1841, 1487, 1786, 1486, 1177, 1552, 1860, 1708, 1718};
        int[] sortedTatarstanYears = getTatarstanBubble(tatarstanInterestingYears);
        System.out.println("Отсортированные исторически важные даты республики Татарстан по возрастанию:");
        for (int i = 0; i < tatarstanInterestingYears.length; i++) {
            System.out.println(sortedTatarstanYears[i]);
        }
    }

    private static int[] getTatarstanBubble (int[] arrayForSorting){
        for (int i = 0; i < (arrayForSorting.length - 1); i++) {
            for (int j = 0; i < (arrayForSorting.length - j - 1); j++) {
                if (arrayForSorting[j + 1] < arrayForSorting[j]) {
                    int swap = arrayForSorting[j];
                    arrayForSorting[j] = arrayForSorting[j + 1];
                    arrayForSorting[j + 1] = swap;
                }
            }
        }
        return arrayForSorting;
    }
}