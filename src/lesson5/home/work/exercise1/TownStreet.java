//// ########## lesson_5 git exercise_1 ##########
// 1. Создать коллекцию классов для сущности "город".
package lesson5.home.work.exercise1;

public class TownStreet {
    String streetName;
    int streetKadastrNumber;
    int streetLength;
    int streetWidth;
    boolean mainStreet;
    TownHouse[] townHouses;
    TownPark[] townParks;

    public TownStreet() {
        this.streetName = "";
        this.streetKadastrNumber = 0;
        this.streetLength = 0;
        this.streetWidth = 0;
        this.mainStreet = false;
        this.townHouses = new TownHouse[0];
        this.townParks = new TownPark[0];
    }

    public TownStreet(String streetName, int streetKadastrNumber, int streetLength, int streetWidth, boolean mainStreet, TownHouse[] townHouses, TownPark[] townParks) {
        this.streetName = streetName;
        this.streetKadastrNumber = streetKadastrNumber;
        this.streetLength = streetLength;
        this.streetWidth = streetWidth;
        this.mainStreet = mainStreet;
        this.townHouses = townHouses;
        this.townParks = townParks;
    }
}