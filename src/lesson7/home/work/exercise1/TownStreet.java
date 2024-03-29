//// ########## lesson_7 git exercise_1 ##########
// 1. написать метод для класса улицы, который добавляет дом - добавление неизвестного кол-ва улиц/домов
// 1.1 написать метод для класса города, который добавляет улицу - добавление неизвестного кол-ва улиц/домов
// 2. каждая улица возвращает площадь занимаемую домами
// 2.1 каждый город возвращает площадь занимаемую улицами и площадь парков
// 2.2 каждый город возвращает количество домов
package lesson7.home.work.exercise1;

public class TownStreet {
    private final String streetName;
    private final int streetKadastrNumber;
    private final float streetLength;
    private final float streetWidth;
    private final boolean mainStreet;
    private TownHouse[] townHouses;
    private final TownPark[] townParks;

    public TownStreet(String streetName, int streetKadastrNumber, float streetLength, float streetWidth, boolean mainStreet, TownHouse[] townHouses, TownPark[] townParks) {
        this.streetName = streetName;
        this.streetKadastrNumber = streetKadastrNumber;
        this.streetLength = streetLength;
        this.streetWidth = streetWidth;
        this.mainStreet = mainStreet;
        this.townHouses = townHouses;
        this.townParks = townParks;
    }

    public void addNewTownHouse (TownHouse townHouses) {
        if (this.townHouses == null) {
            TownHouse[] newTownHouse = new TownHouse[1];
            newTownHouse[0] = townHouses;
            this.townHouses = newTownHouse;
        }
        else {
            TownHouse[] newTownHouse = new TownHouse[this.townHouses.length + 1];
            for (int i = 0; i < this.townHouses.length; i++) {
                newTownHouse[i] = this.townHouses[i];
            }
            newTownHouse[this.townHouses.length] = townHouses;
            this.townHouses = newTownHouse;
        }
    }
    public int getTownHousesQuantity() {
        if (this.townHouses == null){
            return 0;
        }
        return this.townHouses.length;
    }

    public float getTownHousesArea() {
        float housesArea = 0;
        for(int i = 0; i < townHouses.length; i++){
            TownHouse townHouse = townHouses[i];
            if (townHouse != null){
                housesArea += this.townHouses[i].getTownHouseArea();
            }
        }
        return housesArea;
    }

    public float getTownParksArea() {
        float parksArea = 0;
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