package fallmerayer.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
    public final String name;
    public final int population;

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    public static void main(String[] args) {
        List<City> cityTour = new ArrayList<>();
        City g = new City("Gotham (cathedral)", 8_000_000);
        City m = new City("Metropolis (pleasure garden)", 1_600_000);
        City h = new City("Hogsmeade (Shopping Street)", 1_124);
        Collections.addAll(cityTour,g,m,h);

        System.out.println(cityTour);

        cityTour.removeIf(city -> city.population <= 10000);
        cityTour.replaceAll(city -> new City(city.name.replaceAll("(\\s)\\([^)]*\\)",""), city.population));    // \\s is for whitespace, rest is for the brackets
        cityTour.forEach(city -> System.out.println(city + ","));

        System.out.println(cityTour);


    }
}
