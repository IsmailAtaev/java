package com.task3;


import java.util.ArrayList;
import java.util.Collection;

public class MainTask3 {
    public static void main(String[] args) {

        City city1 = new City("Minsk");
        city1.setRegionCenter(true);

        City city2 = new City("Molodechno");
        City city3 = new City("Borisov");

        City city4 = new City("Vitebsk");
        city4.setRegionCenter(true);

        City city5 = new City("Orsha");
        City city6 = new City("Polotsk");

        City city7 = new City("Gomel");
        city7.setRegionCenter(true);

        City city8 = new City("Dobrush");
        City city9 = new City("Mozyr");

        City city10 = new City("Mogilev");
        city10.setRegionCenter(true);

        City city11 = new City("Bobruisk");

        City city12 = new City("Osipovichi");

        City city13 = new City("Brest");
        city13.setRegionCenter(true);

        City city14 = new City("Ivanovo");

        City city15 = new City("Baranovichi");

        City city16 = new City("Grodno");
        city16.setRegionCenter(true);

        City city17 = new City("Oshmiany");

        City city18 = new City("Lida");

        District district1 = new District("Minsky");
        ArrayList<City> cityArrayList1 = new ArrayList<>();
        cityArrayList1.add(city1);
        district1.setCities(cityArrayList1);

        District district2 = new District("Molodechnensky");
        ArrayList<City> cityArrayList2 = new ArrayList<>();
        cityArrayList1.add(city2);
        district2.setCities(cityArrayList2);

        District district3 = new District("Borisovsky");
        ArrayList<City> cityArrayList3 = new ArrayList<>();
        cityArrayList1.add(city3);
        district3.setCities(cityArrayList1);

        District district4 = new District("Vitebsky");
        ArrayList<City> cityArrayList4 = new ArrayList<>();
        cityArrayList1.add(city4);
        district4.setCities(cityArrayList4);

        District district5 = new District("Orshansky");
        ArrayList<City> cityArrayList5 = new ArrayList<>();
        cityArrayList1.add(city5);
        district5.setCities(cityArrayList5);

        District district6 = new District("Polotsky");
        ArrayList<City> cityArrayList6 = new ArrayList<>();
        cityArrayList1.add(city6);
        district6.setCities(cityArrayList6);

        District district7 = new District("Gomelsky");
        ArrayList<City> cityArrayList7 = new ArrayList<>();
        cityArrayList1.add(city7);
        district7.setCities(cityArrayList7);

        District district8 = new District("Dobrushsky");
        ArrayList<City> cityArrayList8 = new ArrayList<>();
        cityArrayList1.add(city8);
        district8.setCities(cityArrayList8);

        District district9 = new District("Mozyrsky");
        ArrayList<City> cityArrayList9 = new ArrayList<>();
        cityArrayList1.add(city9);
        district9.setCities(cityArrayList9);

        District district10 = new District("Mogilevsky");
        ArrayList<City> cityArrayList10 = new ArrayList<>();
        cityArrayList1.add(city10);
        district10.setCities(cityArrayList10);

        District district11 = new District("Bobruisky");
        ArrayList<City> cityArrayList11 = new ArrayList<>();
        cityArrayList1.add(city11);
        district11.setCities(cityArrayList11);

        District district12 = new District("Osipovichsky");
        ArrayList<City> cityArrayList12 = new ArrayList<>();
        cityArrayList1.add(city12);
        district12.setCities(cityArrayList12);

        District district13 = new District("Brestsky");
        ArrayList<City> cityArrayList13 = new ArrayList<>();
        cityArrayList1.add(city13);
        district13.setCities(cityArrayList13);

        District district14 = new District("Ivanovsky");
        ArrayList<City> cityArrayList14 = new ArrayList<>();
        cityArrayList1.add(city14);
        district14.setCities(cityArrayList14);

        District district15 = new District("Boranovichsky");
        ArrayList<City> cityArrayList15 = new ArrayList<>();
        cityArrayList1.add(city15);
        district15.setCities(cityArrayList15);

        District district16 = new District("Grodnensky");
        ArrayList<City> cityArrayList16 = new ArrayList<>();
        cityArrayList1.add(city16);
        district16.setCities(cityArrayList16);

        District district17 = new District("Oshmiansky");
        ArrayList<City> cityArrayList17 = new ArrayList<>();
        cityArrayList1.add(city17);
        district17.setCities(cityArrayList17);

        District district18 = new District("Lidsky");
        ArrayList<City> cityArrayList18 = new ArrayList<>();
        cityArrayList1.add(city18);
        district18.setCities(cityArrayList18);


        Region region1 = new Region("Minskaya");
        region1.setRegionArea(23);
        ArrayList<District> districts1 = new ArrayList<>();
        districts1.add(district1);
        districts1.add(district2);
        districts1.add(district3);
        region1.setDistricts(districts1);

        Region region2 = new Region("Vitebskaya");
        region2.setRegionArea(20);
        ArrayList<District> districts2 = new ArrayList<>();
        districts2.add(district4);
        districts2.add(district5);
        districts2.add(district6);
        region2.setDistricts(districts2);

        Region region3 = new Region("Gomelskaya");
        region3.setRegionArea(40);
        ArrayList<District> districts3 = new ArrayList<>();
        districts3.add(district7);
        districts3.add(district8);
        districts3.add(district9);
        region3.setDistricts(districts3);

        Region region4 = new Region("Mogilevskaya");
        region4.setRegionArea(50);
        ArrayList<District> districts4 = new ArrayList<>();
        districts4.add(district10);
        districts4.add(district11);
        districts4.add(district12);
        region4.setDistricts(districts4);

        Region region5 = new Region("Brestskaya");
        region5.setRegionArea(60);
        ArrayList<District> districts5 = new ArrayList<>();
        districts5.add(district13);
        districts5.add(district14);
        districts5.add(district15);
        region5.setDistricts(districts5);

        Region region6 = new Region("Grodnenskaya");
        region6.setRegionArea(45);
        ArrayList<District> districts6 = new ArrayList<>();
        districts6.add(district16);
        districts6.add(district17);
        districts6.add(district18);
        region6.setDistricts(districts6);

        Country myCountry = new Country("Belarus", city1);

        myCountry.printCapital();

        ArrayList<Region> regionArrayList = new ArrayList<>();
        regionArrayList.add(region1);
        regionArrayList.add(region2);
        regionArrayList.add(region3);
        regionArrayList.add(region4);
        regionArrayList.add(region5);
        regionArrayList.add(region6);

        myCountry.setRegions(regionArrayList);
        System.out.println("Region is count = " + myCountry.getRegions().size());
        System.out.println("Count area  = " + myCountry.countArea());

       // region1.printCenter();
        region2.printCenter();
        region3.printCenter();
        region4.printCenter();
        region5.printCenter();
        region6.printCenter();
        System.out.println("\n\n\n");
        myCountry.printCenterRegion();


    }
}
