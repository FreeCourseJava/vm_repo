//// ########## lesson_4 git exercise_1 ##########
// 1. Реализовать сортировку массива интов алгоритмом Cocktail Shaker Sort
package lesson4.home.work.exercise_1;

public class DrunkBrawlInTatarstan {
    public static void main(String[] args) {

        int[] tatarstanInterestingYears = {1408, 1611, 1005, 1654, 1801, 1791, 1855, 1431, 1770, 1758, 1524, 1236, 1841, 1487, 1786, 1486, 1177, 1552, 1860, 1708, 1718};
        int[] sortedTatarstanYears = getDrunkTatarstanSorting(tatarstanInterestingYears);
        System.out.println("Отсортированные исторически важные даты республики Татарстан по возрастанию:");
        for (int i = 0; i < tatarstanInterestingYears.length; i++) {
            System.out.println(sortedTatarstanYears[i]);
        }
    }

    public static int[] getDrunkTatarstanSorting(int[] arrayForSorting) {
        boolean drinkShot = true;
        int arrayFirstElement = 0;
        int arrayLastElement = arrayForSorting.length;
        while (drinkShot) {
            drinkShot = false;
            for (int i = arrayFirstElement; i < arrayLastElement - 1; ++i) {
                if (arrayForSorting[i] > arrayForSorting[i + 1]) {
                    int temp = arrayForSorting[i];
                    arrayForSorting[i] = arrayForSorting[i + 1];
                    arrayForSorting[i + 1] = temp;
                    drinkShot = true;
                }
            }
            if (!drinkShot) {
                break;
            }
            drinkShot = false;
            arrayLastElement = arrayLastElement - 1;
            for (int i = arrayLastElement - 1; i >= arrayFirstElement; i--) {
                if (arrayForSorting[i] > arrayForSorting[i + 1]) {
                    int temp = arrayForSorting[i];
                    arrayForSorting[i] = arrayForSorting[i + 1];
                    arrayForSorting[i + 1] = temp;
                    drinkShot = true;
                }
            }
            arrayFirstElement = arrayFirstElement + 1;
        }
        return arrayForSorting;
    }
}