//// ########## lesson_1 personal lesson_2_home_work.exercise_4 ##########
// 4. Float 1000000000 умножить на само себя несколько раз, вывести результат каждого вычисления и объяснить, что происходит
package lesson1.home.work.theory.exercises;

public class Exercise_4 {
    public static void main(String[] args) {
        float justBillion = 1000000000f;
        float justBillionSquare = justBillion * justBillion;
        System.out.println("Результат возведения в квадрат миллиарда(обычное представление): " + String.format("%f",justBillionSquare));
        System.out.println("Результат возведения в квадрат миллиарда(математическое представление): " + justBillionSquare);
        float justBillionCube = justBillionSquare * justBillion;
        System.out.println("Результат возведения в куб миллиарда(обычное представление): " + String.format("%f",justBillionCube));
        System.out.println("Результат возведения в куб миллиарда(математическое представление): " + justBillionCube);
        float justBillionFourthDegree = justBillionCube * justBillion;
        System.out.println("Результат возведения в четвертую степень миллиарда(обычное представление): " + String.format("%f",justBillionFourthDegree));
        System.out.println("Результат возведения в четвертую степень миллиарда(математическое представление): " + justBillionFourthDegree);
        float justBillionFifthDegree = justBillionFourthDegree * justBillion;
        System.out.println("Результат возведения в пятую степень миллиарда(обычное представление): " + String.format("%f",justBillionFifthDegree));
        System.out.println("Результат возведения в пятую степень миллиарда(математическое представление): " + justBillionFifthDegree);
    }
}

// В данном случае мы наблюдаем ситуацию "переполнения" для типа данных float
// 1) Объявляем переменную типа float justBillion, равное 1000000000
// 2) Объявляем переменную типа float justBillionSquare, которая представлет из себя результат умножения значения переменной justBillion на саму себя
// 3) В результате умножения значение justBillionSquare представлено в виде ближайшего  к получаемому числа но в виде (2 в cтепени n)
// 4) Объявляем переменную типа float justBillionCube, которая представлет из себя результат умножения значения переменной justBillion на justBillionSquare
// 5) В результате умножения значение justBillionCube представлено в виде ближайшего  к получаемому числа но в виде (2 в cтепени n)
// 6) Объявляем переменную типа float justBillionFourthDegree, которая представлет из себя результат умножения значения переменной justBillion на justBillionCube
// 7) В результате умножения значение justBillionCube представлено в виде ближайшего  к получаемому числа но в виде (2 в cтепени n)
// 8) Объявляем переменную типа float justBillionFifthDegree, которая представлет из себя результат умножения значения переменной justBillion на justBillionFourthDegree
// 9) В результате умножения значение justBillionFifthDegree слишком велико для представления, поэтому по умолчанию возвращается Infinity

//Результат выполнения функции:
//      Результат возведения в квадрат миллиарда(обычное представление): 999999984306749440,000000
//      Результат возведения в квадрат миллиарда(математическое представление): 9.9999998E17
//      Результат возведения в куб миллиарда(обычное представление): 999999988484154800000000000,000000
//      Результат возведения в куб миллиарда(математическое представление): 1.0E27
//      Результат возведения в четвертую степень миллиарда(обычное представление): 999999961690316200000000000000000000,000000
//      Результат возведения в четвертую степень миллиарда(математическое представление): 1.0E36
//      Результат возведения в пятую степень миллиарда(обычное представление): Infinity
//      Результат возведения в пятую степень миллиарда(математическое представление): Infinity
//      Process finished with exit code 0