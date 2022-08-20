//// ########## lesson_8 git exercise_1 ##########
// 1. Объединить улицу, парк (дом) в родителя Measurable, сделать универсальный расширяемый массив для Measurable
package lesson8.home.work.exercise1;

public class TownHouse extends Measurable{

    private final int houseNumber;

    public TownHouse(int houseNumber, float townElementLength, float townElementWidth) {
        super(townElementLength,townElementWidth);
        this.houseNumber = houseNumber;
    }

}