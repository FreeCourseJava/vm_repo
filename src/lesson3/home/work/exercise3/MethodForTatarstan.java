//// ########## lesson_3 git exercise_3 ##########
// 3. Написать метод, который на вход принимает отсортированный массив годов (из 2-го задания) и произвольный год,
// возвращает boolean значение, которое означает наличие или отсутствие даты в переданном массиве.
// Читаем и используем binary search (бинарный поиск).
package lesson3.home.work.exercise3;
import java.util.Random;

public class MethodForTatarstan {
    public static void main(String[] args) {

        int[] tatarstanInterestingYears = {1408, 1611, 1005, 1654, 1801, 1791, 1855, 1431, 1770, 1758, 1524, 1236, 1841, 1487, 1786, 1486, 1177, 1552, 1860, 1708, 1718};
        int[] randomYears = {1438, 1511, 1905, 1754, 1841, 1891, 1875, 1439, 1760, 1558,1431, 1770, 1758, 1524, 1236, 1841, 1487, 1786, 1486, 1177};
        int[] sortedTatarstanYears = getTatarstanBubble(tatarstanInterestingYears);
        int randomYearElementNumber = getRandomArrayElementNumber(1,1,randomYears.length);
        int randomYear = randomYears[randomYearElementNumber];

        boolean resultOfSearching = getSearch(sortedTatarstanYears,randomYears[randomYearElementNumber]);
        if (resultOfSearching){
            System.out.println(randomYear + " год есть в массиве исторически важных дат республики Татарстан");
        }
        else {
            System.out.println(randomYear + " год отсутствует в массиве исторически важных дат республики Татарстан");
        }

        boolean resultOfSearchingWithWhile = getSearchWithWhile(sortedTatarstanYears,randomYears[randomYearElementNumber]);
        if (resultOfSearchingWithWhile){
            System.out.println(randomYear + " год есть в массиве исторически важных дат республики Татарстан");
        }
        else {
            System.out.println(randomYear + " год отсутствует в массиве исторически важных дат республики Татарстан");
        }
    }

    public static boolean getSearch(int[] arrayForSearching, int valueForSearching) {
        int arrayFirstElement = 0; int arrayLastElement = arrayForSearching.length - 1;
        for ( ; ; ) {
            int key = (arrayFirstElement + arrayLastElement) / 2;
            if (arrayForSearching[key] > valueForSearching) {
                arrayLastElement = key - 1;
            }
            else if (arrayForSearching[key] < valueForSearching) {
                arrayFirstElement = key + 1;
            }
            else {
                return true;
            }
            if (arrayFirstElement > arrayLastElement) {
                return false;
            }
        }
    }

    public static boolean getSearchWithWhile(int[] arrayForSearching, int valueForSearching) {
        int arrayFirstElement = 0; int arrayLastElement = arrayForSearching.length - 1;
        while (true) {
            int key = (arrayFirstElement + arrayLastElement) / 2;
            if (arrayForSearching[key] > valueForSearching) {
                arrayLastElement = key - 1;
            }
            else if (arrayForSearching[key] < valueForSearching) {
                arrayFirstElement = key + 1;
            }
            else {
                return true;
            }
            if (arrayFirstElement > arrayLastElement) {
                return false;
            }
        }
    }

    private static int[] getTatarstanBubble(int[] arrayForSorting) {
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

    public static int getRandomArrayElementNumber (int size, int minSize, int maxSize){
        return new Random().ints(size, minSize, maxSize).findFirst().getAsInt();
    }
}