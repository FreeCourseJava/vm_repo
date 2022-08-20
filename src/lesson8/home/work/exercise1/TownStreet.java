//// ########## lesson_8 git exercise_1 ##########
// 1. Объединить улицу, парк (дом) в родителя Measurable, сделать универсальный расширяемый массив для Measurable
package lesson8.home.work.exercise1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TownStreet extends Measurable {
    private final String streetName;
    private final int streetKadastrNumber;
    private final boolean mainStreet;
    private final TownElement townHouses;
    private final TownElement townParks;

    public TownStreet(String streetName, int streetKadastrNumber, float townElementLength, float townElementWidth, boolean mainStreet, TownHouse[] townHouses, TownPark[] townParks) {
        super(townElementLength,townElementWidth);
        this.streetName = streetName;
        this.streetKadastrNumber = streetKadastrNumber;
        this.mainStreet = mainStreet;
        this.townHouses = new TownElement();
        this.townParks = new TownElement();
    }

    public void addNewTownHouse(TownHouse newTownHouse){
        townHouses.addNewTownElement(newTownHouse);
    }

    public int getTownHousesQuantity() {
        if (this.townHouses == null){
            return 0;
        }
        return this.townHouses.townElementObjectLength;
    }

    public float getTownHousesArea() {
        return this.townHouses.getTownElementsArea();
    }

    public float getTownParksArea() {
        return this.townParks.getTownElementsArea();
    }

}