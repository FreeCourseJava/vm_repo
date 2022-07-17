//// ########## lesson_3 git exercise_1 ##########
// 1. Создать массив интов, заполнить его значениями Integer.MIN_VALUE. Поменять какие-то значения в массиве.
// Посчитать сколько элементов массива не равны Integer.MIN_VALUE. Таким образом получим сколько элементов менялось от первоначального.
package lesson3.home.work.exercise_1;
import java.util.*;
import java.util.stream.Stream;

public class MinValueArray {
    public static void main(String[] args) {

        int[] arrayForExercise = getRandomArrayForExercise();
        System.out.println("Сгенерирован массив, все элементы которого по умолчанию представлены в виде минимального значения базового типа данных int, размером " + arrayForExercise.length + " элементов, имеющий вид:\n" + Arrays.toString(arrayForExercise));
        int[] valuesForChanges = getRandomValuesForChanges(getRandomRandomQuantityOfChanges(1,1,arrayForExercise.length),Integer.MIN_VALUE + 1, Integer.MAX_VALUE);
        System.out.println("Сгенерированы случайные числа для подмены в массиве в количестве " + valuesForChanges.length + " элементов, имеющих вид:\n" + Arrays.toString(valuesForChanges));
        int[] newArrayForExercise = getRandomChanges(arrayForExercise, valuesForChanges);
        System.out.println("Сгенерирован массив для упражнения, в массиве " + newArrayForExercise.length + " элементов, имеющих вид:\n" + Arrays.toString(newArrayForExercise));

        int totalCountOfChanges=0;
        List<Integer> listTotalChanged = new ArrayList<>();
        for (int i = 0; i < newArrayForExercise.length; i++) {
            if (newArrayForExercise[i] != Integer.MIN_VALUE) {
                listTotalChanged.add(i);
                totalCountOfChanges++;
            }
        }
        System.out.println("В массиве для упражнения количество подмен равно " + totalCountOfChanges + " для элементов с индесами\n" + listTotalChanged);
    }

    public static int getRandomArraySizeForExercise (int size, int minSize, int maxSize){
        return new Random().ints(size, minSize, maxSize).findFirst().getAsInt();
    }

    public static int[] getRandomArrayForExercise (){
        int[] RandomArrayForExercise = new int[getRandomArraySizeForExercise(1,8,16)];
        Arrays.fill(RandomArrayForExercise, Integer.MIN_VALUE);
        return RandomArrayForExercise;
    }

    public static int getRandomRandomQuantityOfChanges (int size, int minSize, int maxSize){
        return new Random().ints(size, minSize, maxSize).findFirst().getAsInt();
    }

    public static int[] getRandomValuesForChanges (int size, int minSize, int maxSize){
        Stream<Integer> randomValuesForChanges = new Random().ints(size, minSize, maxSize).boxed();
        return randomValuesForChanges.mapToInt(Integer::intValue).toArray();
    }

    private static int[] getRandomChanges(int[] arrayForExercise, int[] valuesForChanges){
        System.arraycopy(valuesForChanges, 0, arrayForExercise, 0, valuesForChanges.length);
        List<Integer> newArrayForExercise = Arrays.asList(Arrays.stream(arrayForExercise).boxed().toArray(Integer[]::new));
        Collections.shuffle(newArrayForExercise);
        return newArrayForExercise.stream().mapToInt(Integer::intValue).toArray();
    }
}