//// ########## lesson_4 git exercise_2 ##########
// 2. Переписать поиск числа в отсортированном массиве интов алгоритмом binary search используя рекурсию и копирование массива.
package lesson4.home.work.exercise_2;
import java.util.Random;

public class MethodForTatarstanWithRecursion {
    public static void main(String[] args) {

        int[] tatarstanInterestingYears = {1408, 1611, 1005, 1654, 1801, 1791, 1855, 1431, 1770, 1758, 1524, 1236, 1841, 1487, 1786, 1486, 1177, 1552, 1860, 1708, 1718};
        int[] randomYears = {1438, 1511, 1905, 1754, 1841, 1891, 1875, 1439, 1760, 1558,1431, 1770, 1758, 1524, 1236, 1841, 1487, 1786, 1486, 1177};

        int randomYear = randomYears[getRandomArrayElementNumber(1,1,randomYears.length)];
        int resultOfSearching = getSearchWithRecursion(tatarstanInterestingYears,randomYear,0,tatarstanInterestingYears.length-1);
        if (resultOfSearching == randomYear){
            System.out.println(randomYear + " год есть в массиве исторически важных дат республики Татарстан");
        }
        else {
            System.out.println(randomYear + " год отсутствует в массиве исторически важных дат республики Татарстан");
        }
    }

    public static int getSearchWithRecursion(int[] arrayForSearching, int valueForSearching, int arrayFirstElement, int arrayLastElement) {
        if (arrayLastElement >= arrayFirstElement){
            int arrayMiddleElement = arrayFirstElement + (arrayLastElement - arrayFirstElement) / 2;
            if (arrayForSearching[arrayMiddleElement]==valueForSearching){
                return arrayMiddleElement;
            }
            if (arrayForSearching[arrayMiddleElement]>valueForSearching){
                return getSearchWithRecursion(arrayForSearching, valueForSearching,arrayFirstElement,arrayMiddleElement - 1);
            }
            return getSearchWithRecursion(arrayForSearching, valueForSearching,arrayMiddleElement + 1,arrayLastElement);
        }
        return -1;
    }

    public static int getRandomArrayElementNumber (int size, int minSize, int maxSize){
        return new Random().ints(size, minSize, maxSize).findFirst().getAsInt();
    }
}