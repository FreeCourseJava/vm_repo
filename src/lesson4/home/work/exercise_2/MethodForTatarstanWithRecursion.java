//// ########## lesson_4 git exercise_2 ##########
// 2. Переписать поиск числа в отсортированном массиве интов алгоритмом binary search используя рекурсию и копирование массива.
package lesson4.home.work.exercise_2;
import java.util.Random;

public class MethodForTatarstanWithRecursion {
    public static void main(String[] args) {

        int[] tatarstanInterestingYears = {1408, 1611, 1005, 1654, 1801, 1791, 1855, 1431, 1770, 1758, 1524, 1236, 1841, 1487, 1786, 1486, 1177, 1552, 1860, 1708, 1718};
        int[] randomYears = {1438, 1511, 1905, 1754, 1841, 1891, 1875, 1439, 1760, 1558,1431, 1770, 1758, 1524, 1236, 1841, 1487, 1786, 1486, 1177};
        int randomYear = randomYears[getRandomArrayElementNumber(randomYears.length)];
        boolean resultOfSearching = binarySearchRecursive(tatarstanInterestingYears,randomYear);
        if (resultOfSearching){
            System.out.println(randomYear + " год есть в массиве исторически важных дат республики Татарстан");
        }
        else {
            System.out.println(randomYear + " год отсутствует в массиве исторически важных дат республики Татарстан");
        }
    }

    private static boolean binarySearchRecursive(int[] arrayForSearching, int valueForSearching) {
        if (arrayForSearching.length == 0) {
            return false;
        }
        int arrayFirstElement = 0;
        int arrayLastElement = arrayForSearching.length - 1;
        int arrayMiddleElement = (arrayFirstElement + arrayLastElement) / 2;
        if (arrayForSearching[arrayMiddleElement] == valueForSearching) {
            return true;
        }
        if (arrayForSearching[arrayMiddleElement] < valueForSearching) {
            arrayFirstElement = arrayMiddleElement + 1;
        }
        int[] halfOfArrayForSeaching = new int[arrayMiddleElement];
        System.arraycopy(arrayForSearching, arrayFirstElement, halfOfArrayForSeaching, 0, arrayMiddleElement);
        return binarySearchRecursive(halfOfArrayForSeaching, valueForSearching);
    }

    public static int getRandomArrayElementNumber (int maxSize){
        return new Random().ints(1, 1, maxSize).findFirst().getAsInt();
    }
}