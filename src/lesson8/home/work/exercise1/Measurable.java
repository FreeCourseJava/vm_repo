//// ########## lesson_8 git exercise_1 ##########
// 1. Объединить улицу, парк (дом) в родителя Measurable, сделать универсальный расширяемый массив для Measurable
package lesson8.home.work.exercise1;

public class Measurable {
    private final float townElementLength;
    private final float townElementWidth;

    public Measurable(float townElementLength, float townElementWidth) {
        this.townElementLength = townElementLength;
        this.townElementWidth = townElementWidth;
    }

    public float getTownElementArea(){
        return this.townElementLength * this.townElementWidth;
    }

}