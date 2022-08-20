//// ########## lesson_8 git exercise_1 ##########
// 1. Объединить улицу, парк (дом) в родителя Measurable, сделать универсальный расширяемый массив для Measurable
package lesson8.home.work.exercise1;

public class DowntonAbbey {
    public static void main(String[] args) {

        TownHouse houseNumberOne = new TownHouse(1, 30, 10);
        houseNumberOne.getTownElementArea();
        TownHouse houseNumberThirteen = new TownHouse(13, 60, 11);
        TownHouse[] houseNumberOneOnStreet = {houseNumberOne};
        TownHouse[] housesOfCherepovec = {houseNumberOne, houseNumberThirteen};

        TownPark parkAnniversary = new TownPark("Парк 200-летия Череповца", 5575, 3210);
        TownPark parkLeninskyKomsomol = new TownPark("Парк Ленинского Комсомола", 43000, 211);
        TownPark[] parkAnniversaryOnStreet = {parkAnniversary};
        TownPark[] parksOfCherepovec = {parkAnniversary, parkLeninskyKomsomol};

        TownStreet cherKrasnodoncev = new TownStreet("Krasnodoncev", 215, 470, 9, true, houseNumberOneOnStreet, parkAnniversaryOnStreet);
        cherKrasnodoncev.addNewTownHouse(houseNumberOne);
        System.out.println("Площадь улицы Krasnodoncev равна: " + cherKrasnodoncev.getTownElementArea());
        System.out.println("Площадь домов улицы Krasnodoncev равна: " + cherKrasnodoncev.getTownHousesArea());
        System.out.println("Площадь парков улицы Krasnodoncev равна: " + cherKrasnodoncev.getTownParksArea());
        System.out.println("Количество домов улицы Krasnodoncev равна: " + cherKrasnodoncev.getTownHousesQuantity());

        TownStreet cherLebedeva = new TownStreet("Lebedeva", 215, 200, 3, false, housesOfCherepovec, parksOfCherepovec);
        TownStreet[] streetsOfCherepovec = {cherKrasnodoncev, cherLebedeva};

        Town cherepovec = new Town("Cherepovec", 315186, 122 , streetsOfCherepovec);
        cherepovec.addNewTownStreet(cherLebedeva);
        System.out.println("Площадь улиц города Cherepovec равна: " + cherepovec.getTownStreetsTotalArea());
        System.out.println("Площадь домов города Cherepovec равна: " + cherepovec.getTownHousesTotalArea());
        System.out.println("Площадь парков города Cherepovec равна: " + cherepovec.getTownParksTotalArea());
        System.out.println("Количество домов города Cherepovec равно: " + cherepovec.getTownHousesTotalQuantity());

    }
}