package Excersices.Chapter6;

import java.awt.*;

public class Animals {
    public String sound;
    public Color colour;
    public int age;

    public void printAnimal() {
        System.out.println("The animal sounds like :" + sound + "and has the colour" +  colour + "and is " + age + "years old");
    }

    Animals(String sound,Color colour,int age) {
        this.sound = sound;
        this.colour = colour;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "sound='" + sound + '\'' +
                ", colour=" + colour +
                ", age=" + age +
                '}';
    }
}
