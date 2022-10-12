package Excersices.Chapter8;

import java.util.List;

public class Streams {

    public static void main(String[] args) {
        String s = countryInfo().stream()
                .map(Country::countryName)
                .findFirst()
                .orElse("");
        System.out.println(s);



    }
    public void task1(){


    }


    private static List<Country> countryInfo() {

        return List.of(
                new Country("Sverige", "Stockholm", 10.07, 450295),
                new Country("Norge", "Oslo", 5.27, 323802),
                new Country("Island", "Reykjavik", 0.33, 102775),
                new Country("Danmark", "Köpenhamn", 5.75, 42931),
                new Country("Finland", "Helsinki", 5.51, 338424),
                new Country("Belgien", "Bryssel", 11.30, 30528),
                new Country("Tyskland", "Berlin", 82.18, 357168),
                new Country("Frankrike", "Paris", 66.99, 640679),
                new Country("Storbritannien", "London", 60.80, 209331),
                new Country("Niue", "Alofi", 0.0016, 261),
                new Country("Mongoliet", "Ulan Batar", 3.08, 1566000),
                new Country("Polen", "Warszawa", 38.63, 312679),
                new Country("Spanien", "Madrid", 46.5, 505990),
                new Country("Portugal", "Lissabon", 10.31, 92212),
                new Country("Italien", "Rom", 60.59, 301338),
                new Country("Grekland", "Aten", 11.18, 131957),
                new Country("Luxemburg", "Luxemburg", 0.58, 2586),
                new Country("Liechtenstein", "Vaduz", 0.038, 160));
    }

}
record Country(String countryName, String capital, double population, int area) {
}