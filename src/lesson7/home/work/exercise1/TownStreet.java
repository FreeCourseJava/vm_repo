//// ########## lesson_7 git exercise_1 ##########
// 1. написать метод для класса улицы, который добавляет дом - добавление неизвестного кол-ва улиц/домов
// 1.1 написать метод для класса города, который добавляет улицу - добавление неизвестного кол-ва улиц/домов
// 2. каждая улица возвращает площадь занимаемую домами
// 2.1 каждый город возвращает площадь занимаемую улицами и площадь парков
// 2.2 каждый город возвращает количество домов
package lesson7.home.work.exercise1;

public class TownStreet {
    String streetName;
    int streetKadastrNumber;
    float streetLength;
    float streetWidth;
    boolean mainStreet;
    TownHouse[] townHouses;
    TownPark[] townParks;

    public TownStreet(String streetName, int streetKadastrNumber, float streetLength, float streetWidth, boolean mainStreet, TownHouse[] townHouses, TownPark[] townParks) {
        this.streetName = streetName;
        this.streetKadastrNumber = streetKadastrNumber;
        this.streetLength = streetLength;
        this.streetWidth = streetWidth;
        this.mainStreet = mainStreet;
        this.townHouses = townHouses;
        this.townParks = townParks;
    }

    public void getNewTownHouse (int houseNumber, float houseLength, float houseWidth) {
        if (this.townHouses == null) {
            TownHouse[] newTownHouse = new TownHouse[1];
            newTownHouse[0] = new TownHouse(houseNumber, houseLength, houseWidth);
            this.townHouses = newTownHouse;
        }
        else {
            TownHouse[] newTownHouse = new TownHouse[this.townHouses.length + 1];
            for (int i = 0; i < this.townHouses.length; i++) {
                newTownHouse[i] = this.townHouses[i];
            }
            newTownHouse[this.townHouses.length] = new TownHouse(houseNumber, houseLength, houseWidth);
            this.townHouses = newTownHouse;
        }
    }
    public int getTownHousesQuantity() {
        if (this.townHouses == null){
            return 0;
        }
        return this.townHouses.length;
    }

    public long getTownHousesArea() {
        long housesArea = 0;
        for(int i = 0; i < townHouses.length; i++){
            TownHouse townHouse = townHouses[i];
            if (townHouse != null){
                housesArea += this.townHouses[i].getTownHouseArea();
            }
        }
        return housesArea;
    }

    public long getTownParksArea() {
        long parksArea = 0;
        for(int i = 0; i < townParks.length; i++){
            TownPark townPark = townParks[i];
            if (townPark != null){
                parksArea += this.townParks[i].getTownParkArea();
            }
        }
        return parksArea;
    }

    public float getTownStreetArea(){
        return this.streetLength * this.streetWidth;
    }

}