//// ########## lesson_1 git exercise_2 ##########
// 2. Поиграться с char. Объявить переменную, прибавить к ней int значение (допустим 1 10 22) и отнять, объяснить как это рабоатет, т.е. какой результат получаем и почему.
package lesson1.home.work.git.exercise2;

public class CharFool {
    public static void main(String[] args) {
        char charExample = 'x';
        int firstInteger = 11022, secondInteger = 13011;
        int sumOfCharAndInt = charExample + firstInteger;
        System.out.println("Результат сложения значения переменной типа char со значением переменной типа int: " + sumOfCharAndInt);
        int subOfCharAndInt = sumOfCharAndInt - secondInteger;
        System.out.println("Результат вычитания значения переменной типа int со значением результата сложения int и char: " + subOfCharAndInt);
    }
}

// В данном случае мы наблюдаем ситуацию автоматического преобразования примитивных типов данных
// 1) Объявляем переменную charExample типа, которой присваиваем значение соответсвуеющее возможному значению данного типа данных char
// 2) Объявляем целочисленный переменные firstInteger и secondInteger, которым присваиваем значения соответсвуеющее возможному значению данного типа данных int
// 3) Объявляем целочисленный переменные sumOfCharAndInt и subOfCharAndInt,
// 3.1) Переменной sumOfCharAndInt присваиваем значения соответсвуеющее результату сложения значения переменных charExample и firstInteger
// 3.1) Переменной subOfCharAndInt присваиваем значения соответсвуеющее результату вычитания значения переменных sumOfCharAndInt и secondInteger
// 4) В результате сложения значение переменной sumOfCharAndInt происходит:
// 4.1) Автоматическое преобразование значения переменной charExample к типу данных int (символ преобразуется в значение соответсвующее его коду ASCII)
// 4.2) К значению из шага 4.1 прибавляется значение переменной firstInteger
// 5) От получившегося результата из шага 4.2 отнимется значение переменной secondInteger, результат вычитания записывается в  значение переменной subOfCharAndInt

//Результат выполнения функции:
//      Результат сложения значения переменной типа char со значением переменной типа int: 11142
//      Результат вычитания значения переменной типа int со значением результата сложения int и char: -1869
//      Process finished with exit code 0