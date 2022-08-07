//// ########## lesson_7 git exercise_1 ##########
// 1. написать метод для класса улицы, который добавляет дом - добавление  неизвестного кол-ва улиц/домов
// 1.1 написать метод для класса города, который добавляет улицу - добавление  неизвестного кол-ва улиц/домов
// 2. каждая улица возвращает площадь занимаемую домами
// 2.1 каждый город возвращает площадь занимаемую улицами и площадь парков
// 2.2 каждый город возвращает количество домов
package lesson7.home.work.exercise1;

public class TownPark {
    String parkName;
    long parkArea;

    public TownPark(String parkName, long parkArea) {
        this.parkName = parkName;
        this.parkArea = parkArea;
    }

    public long getTownParkArea() {
        return this.parkArea;
    }

}