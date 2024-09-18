package com.qa;

import java.lang.reflect.ParameterizedType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Art painting = new Art("Leonardo Da Vinci", "Mona Lisa", "1503", "Italy");

        // Printing to check
        System.out.println("Creator: " + painting.getCreator());
        System.out.println("Title: " + painting.getTitle());
        System.out.println("Date Made: " + painting.getDateMade());
        System.out.println("Country Made: " + painting.getCountryMade());

        Art harryPotter = new Book("Jk Rowling", "Harry Potter", "1997", "England", 223, "Fantasy", "JK Rowling");
        Art[] collection = {harryPotter, painting};
        harryPotter.
        for (Art item: collection){
            System.out.println("***********");
            System.out.println(item);
        }
    }

}