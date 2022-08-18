package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<City> cities = new TreeSet<>();
        City city = new City(+996,"Bishkek");
        City city1  = new City(+1,"USA");
        City city2  = new City(+77,"Kazakstan");
        City city3  = new City(+90,"Turkey");

        addCityss(cities,city);
        addCityss(cities,city1);
        addCityss(cities,city2);
        addCityss(cities,city3);
        System.out.println(cities);
    }
       public static void addCityss(Set<City>cities,City city){
        if (city.getCode() % 2 == 1){
            cities.add(city);
        }
    }
}
