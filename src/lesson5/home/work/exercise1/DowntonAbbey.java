//// ########## lesson_5 git exercise_1 ##########
// 1. Создать коллекцию классов для сущности "город".
package lesson5.home.work.exercise1;

public class DowntonAbbey {
    public static void main(String[] args) {

        TownHouse houseNumberOne = new TownHouse(1, 300);
        TownHouse houseNumberThirteen = new TownHouse(13, 666);
        TownHouse[] housesOfCherepovec = {houseNumberOne, houseNumberThirteen};

        TownPark parkAnniversary = new TownPark("Парк 200-летия Череповца", 55756);
        TownPark parkLeninskyKomsomol = new TownPark("Парк Ленинского Комсомола", 43000);
        TownPark[] parksOfCherepovec = {parkAnniversary, parkLeninskyKomsomol};

        TownStreet cherKrasnodoncev = new TownStreet("Krasnodoncev", 215, 470, 9, true, housesOfCherepovec, parksOfCherepovec);
        TownStreet cherLebedeva = new TownStreet("Lebedeva", 215, 200, 3, false, housesOfCherepovec, parksOfCherepovec);
        TownStreet[] streetOfCherepovec = {cherKrasnodoncev, cherLebedeva};

        Town cherepovec = new Town("Cherepovec", 315186, 122, streetOfCherepovec);
        System.out.printf(String.valueOf(cherepovec));
    }
}