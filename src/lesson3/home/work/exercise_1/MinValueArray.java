//// ########## lesson_3 git exercise_1 ##########
// 1. Создать массив интов, заполнить его значениями Integer.MIN_VALUE. Поменять какие-то значения в массиве.
// Посчитать сколько элементов массива не равны Integer.MIN_VALUE. Таким образом получим сколько элементов менялось от первоначального.
package lesson3.home.work.exercise_1;
import java.util.*;
import java.util.stream.Stream;

public class MinValueArray {
    public static void main(String[] args) {
        
        int arraySizeForExercise = getRandomArraySizeForExercise(1,8,16);
//        int arraySizeForExercise = 4;
        int[] arrayForExercise = new int[arraySizeForExercise];
        Arrays.fill(arrayForExercise, Integer.MIN_VALUE);
        System.out.println("Сгенерирован массив, все элементы которого по умолчанию представлены в виде минимального значения базового типа данных int, размером " + arraySizeForExercise + " элементов, и имеющий вид:\n" + Arrays.toString(arrayForExercise));
        int randomQuantityOfChanges = getRandomRandomQuantityOfChanges(1,1,arraySizeForExercise);
//        int randomQuantityOfChanges = 2;
        int[] valuesForChanges = getRandomValuesForChanges(randomQuantityOfChanges,Integer.MIN_VALUE + 1, Integer.MAX_VALUE);
        System.out.println("Сгенерированы случайные числа для подмены в массиве количестве " + randomQuantityOfChanges + " элементов, и имеющих вид:\n" + Arrays.toString(valuesForChanges));
        int[] newArrayForExercise = getRandomChanges(arrayForExercise, valuesForChanges);
        int totalCountOfChanges=0;
        List<Integer> listTotalChanged = new ArrayList<>();
        for (int i=0; i<newArrayForExercise.length; i++) {
            if (newArrayForExercise[i] != Integer.MIN_VALUE) {
                totalCountOfChanges++;
                listTotalChanged.add(i,i);
            }
        }
        System.out.println(listTotalChanged);
    }

    private static int[] getRandomChanges(int[] arrayForExercise, int[] valuesForChanges) {
        for (int i = 0; i < valuesForChanges.length; i++) {
            List<Integer> listForExerciseArray = new ArrayList<>(valuesForChanges.length);
            List<Integer> listForValuesArray = new ArrayList<>(valuesForChanges.length);
            int randomElementFromExerciseArray = new Random().ints(1, 0, arrayForExercise.length - 1).findFirst().getAsInt();
            int randomElementFromValuesArray = new Random().ints(1, 0, valuesForChanges.length - 1).findFirst().getAsInt();
            for (int repeat = 0; repeat < valuesForChanges.length; repeat++) {
                if(arrayForExercise[randomElementFromExerciseArray] == Integer.MIN_VALUE){
                    if (!listForExerciseArray.contains(randomElementFromExerciseArray)) {
                        if (!listForValuesArray.contains(randomElementFromValuesArray)){
                            listForExerciseArray.add(repeat,randomElementFromExerciseArray);
                            listForValuesArray.add(repeat,randomElementFromValuesArray);
                            arrayForExercise[randomElementFromExerciseArray] = valuesForChanges[randomElementFromValuesArray];
                        }
                    }
                }
            }
        }
        return arrayForExercise;
    }

    public static int getRandomArraySizeForExercise (int size, int minSize, int maxSize){
        return new Random().ints(size, minSize, maxSize).findFirst().getAsInt();
    }

    public static int getRandomRandomQuantityOfChanges (int size, int minSize, int maxSize){
        return new Random().ints(size, minSize, maxSize).findFirst().getAsInt();
    }

    public static int[] getRandomValuesForChanges (int size, int minSize, int maxSize){
        Stream<Integer> ttt = new Random().ints(size, minSize, maxSize).boxed();
        return ttt.mapToInt(Integer::intValue).toArray();
    }
}