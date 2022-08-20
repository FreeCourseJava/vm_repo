//// ########## lesson_8 git exercise_1 ##########
// 1. Объединить улицу, парк (дом) в родителя Measurable, сделать универсальный расширяемый массив для Measurable
package lesson8.home.work.exercise1;

public class Town{
    private final String townName;
    private final int townPopulation;
    private final float townArea;
    private TownStreet[] townStreets;

    public Town(String townName, int townPopulation, float townArea, TownStreet[] townStreets) {
        this.townName = townName;
        this.townPopulation = townPopulation;
        this.townArea = townArea;
        this.townStreets = townStreets;
    }

    public void addNewTownStreet (TownStreet townStreets) {
        if (this.townStreets == null) {
            TownStreet[] newTownStreet = new TownStreet[1];
            newTownStreet[0] = townStreets;
            this.townStreets = newTownStreet;
        }
        else {
            TownStreet[] newTownStreet = new TownStreet[this.townStreets.length + 1];
            for (int i = 0; i < this.townStreets.length; i++) {
                newTownStreet[i] = this.townStreets[i];
            }
            newTownStreet[this.townStreets.length] = townStreets;
            this.townStreets = newTownStreet;
        }
    }

    public int getTownHousesTotalQuantity(){
        int townHousesTotalQuantity = 0;
        for (int i = 0; i < this.townStreets.length; i++){
            townHousesTotalQuantity += this.townStreets[i].getTownHousesQuantity();
        }
        return townHousesTotalQuantity;
    }

    public long getTownStreetsTotalArea() {
        long townStreetsTotalArea = 0;
        for(int i = 0; i < townStreets.length; i++){
            TownStreet townStreet = townStreets[i];
            if (townStreet != null){
                townStreetsTotalArea += this.townStreets[i].getTownElementArea();
            }
        }
        return townStreetsTotalArea;
    }

    public long getTownHousesTotalArea() {
        long townHousesTotalArea = 0;
        for(int i = 0; i < townStreets.length; i++){
            TownStreet townStreet = townStreets[i];
            if (townStreet != null){
                townHousesTotalArea += this.townStreets[i].getTownElementArea();
            }
        }
        return townHousesTotalArea;
    }

    public long getTownParksTotalArea() {
        long townParksTotalArea = 0;
        for(int i = 0; i < townStreets.length; i++){
            TownStreet townStreet = townStreets[i];
            if (townStreet != null){
                townParksTotalArea += this.townStreets[i].getTownElementArea();
            }
        }
        return townParksTotalArea;
    }
}