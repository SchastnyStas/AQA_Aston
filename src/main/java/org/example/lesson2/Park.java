package org.example.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attractions> attractionsList;

    public Park() {
        this.attractionsList = new ArrayList<>();
    }

    public void displayAttractions() {
        for (Attractions attraction : attractionsList) {
            attraction.display();
        }
    }

    public void addAttraction(String name, String hours, String price) {
        Attractions attraction = new Attractions(name, hours, price);
        attractionsList.add(attraction);
    }

    class Attractions {
        String name;
        String hours;
        String price;

        Attractions(String name, String hours, String price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }

        public void display() {
            System.out.println("В парке работает " + name + " c " + hours + ". Стоимость " + price + ".");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Super8", "7:30 - 12:30", "15 RUB");
        park.addAttraction("Roller Coaster", "10:00 - 22:00", "25 RUB");
        park.addAttraction("Ferris Wheel", "12:00 - 20:00", "20 RUB");
        park.displayAttractions();
    }
}