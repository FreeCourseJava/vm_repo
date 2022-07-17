//// ########## lesson_5 git exercise_1 ##########
// 1. Создать коллекцию классов для сущности "город".
package lesson5.home.work.exercise1;

public class TownPark {
    String parkName;
    int parkArea;

    public TownPark() {
        this.parkName = "";
        this.parkArea = 0;
    }

    public TownPark(String parkName, int parkArea) {
        this.parkName = parkName;
        this.parkArea = parkArea;
    }
}