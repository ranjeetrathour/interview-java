package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class City {
    private String cityName;
    private Long population;

    public City(String cityName, Long population) {
        this.cityName = cityName;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return cityName + " - " + population;
    }
}

public class GroupCityByCategory {
    public static void main(String[] args) {

        List<City> cities = Arrays.asList(
                new City("Delhi", 10000L),
                new City("Noida", 50000L),
                new City("Agra", 100000L),       // 1 lakh
                new City("Kanpur", 250000L),
                new City("Lucknow", 500000L),
                new City("Jaipur", 1200000L),
                new City("Patna", 2500000L),
                new City("Bhopal", 4000000L),
                new City("Mumbai", 5000000L),   // 50 lakh
                new City("Bangalore", 8000000L)
        );


        Map<String, List<City>> collect = cities.stream()
                .collect(Collectors.groupingBy(city -> {
                    if (city.getPopulation() <= 100000L) {
                        return "SMALL";
                    } else if (city.getPopulation() > 100000L && city.getPopulation() < 5000000L) {
                        return "MEDIUM";
                    } else {
                        return "HIGH";
                    }
                }));
        System.out.println(collect);
    }
}