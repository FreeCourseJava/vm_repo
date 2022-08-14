//// ########## lesson_7 git exercise_1 ##########
// 1. написать метод для класса улицы, который добавляет дом - добавление неизвестного кол-ва улиц/домов
// 1.1 написать метод для класса города, который добавляет улицу - добавление неизвестного кол-ва улиц/домов
// 2. каждая улица возвращает площадь занимаемую домами
// 2.1 каждый город возвращает площадь занимаемую улицами и площадь парков
// 2.2 каждый город возвращает количество домов
package lesson7.home.work.exercise1;

public class Town {
    private String townName;
    private int townPopulation;
    private float townArea;
    private TownStreet[] townStreets;

    public Town(String townName, int townPopulation, float townArea, TownStreet[] townStreets) {
        this.townName = townName;
        this.townPopulation = townPopulation;
        this.townArea = townArea;
        this.townStreets = townStreets;
    }

    public void addNewTownStreets (TownStreet townStreets) {
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

    public float getTownStreetsTotalArea() {
        float townStreetsTotalArea = 0;
        for(int i = 0; i < townStreets.length; i++){
            TownStreet townStreet = townStreets[i];
            if (townStreet != null){
                townStreetsTotalArea += this.townStreets[i].getTownStreetArea();
            }
        }
        return townStreetsTotalArea;
    }

    public float getTownHousesTotalArea() {
        float townHousesTotalArea = 0;
        for(int i = 0; i < townStreets.length; i++){
            TownStreet townStreet = townStreets[i];
            if (townStreet != null){
                townHousesTotalArea += this.townStreets[i].getTownHousesArea();
            }
        }
        return townHousesTotalArea;
    }

    public float getTownParksTotalArea() {
        float townParksTotalArea = 0;
        for(int i = 0; i < townStreets.length; i++){
            TownStreet townStreet = townStreets[i];
            if (townStreet != null){
                townParksTotalArea += this.townStreets[i].getTownParksArea();
            }
        }
        return townParksTotalArea;
    }
}