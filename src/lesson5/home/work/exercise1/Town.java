//// ########## lesson_5 git exercise_1 ##########
// 1. Создать коллекцию классов для сущности "город".
package lesson5.home.work.exercise1;

public class Town {
    String townName;
    int townPopulation;
    int townArea;
    TownStreet[] townStreets;

    public Town() {
        this.townName = "";
        this.townPopulation = 500000;
        this.townArea = 200;
        this.townStreets = new TownStreet[0];
    }

    public Town(String townName, int townPopulation, int townArea, TownStreet[] townStreets) {
        this.townName = townName;
        this.townPopulation = townPopulation;
        this.townArea = townArea;
        this.townStreets = townStreets;
    }
}