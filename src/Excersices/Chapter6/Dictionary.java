package Excersices.Chapter6;

import Excersices.Chapter6.Uppgift.Boat;
import Excersices.Chapter6.Uppgift.Vehicle;

import java.awt.*;
import java.util.HashMap;

public class Dictionary {

    public static void main(String[] args) {
        Animals dog = new Animals("Woff", Color.RED, 3);
        Animals cat = new Animals("Mjau", Color.black, 4);

        HashMap<String, Animals> dictionary = new HashMap<>();
        dictionary.put("Viktor", dog);
        dictionary.put("Julia", cat);

        System.out.println("Här är " + dictionary.get("Viktor"));
        System.out.println("Här är " + dictionary.get("Julia"));

    }
}
